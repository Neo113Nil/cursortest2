package p6;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: p6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4849j implements InterfaceC4841b, AutoCloseable {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f39835u = Logger.getLogger(C4849j.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C4847h f39836n;

    public C4849j() {
        EnumC4852m enumC4852m = EnumC4852m.f39843n;
        this.f39836n = new C4847h(new ConcurrentHashMap());
    }

    public static AssertionError a(C4846g c4846g) {
        AssertionError assertionError = new AssertionError("Thread [" + c4846g.f39827n + "] opened a scope of " + c4846g.f39829v + " here:");
        assertionError.setStackTrace(c4846g.getStackTrace());
        return assertionError;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C4847h c4847h;
        while (true) {
            c4847h = this.f39836n;
            Reference poll = c4847h.poll();
            if (poll == null) {
                break;
            } else {
                c4847h.f40061n.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = c4847h.f39831w;
        List list = (List) concurrentHashMap.values().stream().filter(new S6.h(1)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger = f39835u;
            logger.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger.log(Level.SEVERE, "Scope leaked", (Throwable) a((C4846g) it.next()));
            }
        }
        throw a((C4846g) list.get(0));
    }

    @Override // p6.InterfaceC4841b
    public final C4840a j() {
        return EnumC4852m.f39843n.j();
    }

    @Override // p6.InterfaceC4841b
    public final InterfaceC4845f k(C4840a c4840a) {
        int i;
        InterfaceC4845f k9 = EnumC4852m.f39843n.k(c4840a);
        C4846g c4846g = new C4846g(c4840a);
        StackTraceElement[] stackTrace = c4846g.getStackTrace();
        for (int i4 = 0; i4 < stackTrace.length; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (stackTraceElement.getClassName().equals(C4840a.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i = i4 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i6 = 1;
        while (i6 < stackTrace.length) {
            String className = stackTrace[i6].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i6++;
        }
        c4846g.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6, stackTrace.length));
        return new C4848i(this, k9, c4846g);
    }
}
