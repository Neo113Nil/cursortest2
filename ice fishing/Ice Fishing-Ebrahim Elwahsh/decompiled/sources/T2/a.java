package T2;

import O3.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3094b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3095c;

    public a(String str, int i) {
        this.f3093a = i;
        switch (i) {
            case 1:
                this.f3094b = str;
                this.f3095c = new AtomicInteger(1);
                break;
            default:
                this.f3095c = Executors.defaultThreadFactory();
                this.f3094b = str;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3093a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3095c).newThread(new i(1, runnable));
                newThread.setName(this.f3094b);
                return newThread;
            default:
                int andIncrement = ((AtomicInteger) this.f3095c).getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f3094b;
                StringBuilder sb = new StringBuilder(AbstractC5051n.a(12, length, str));
                sb.append("AdWorker(");
                sb.append(str);
                sb.append(") #");
                sb.append(andIncrement);
                return new Thread(runnable, sb.toString());
        }
    }
}
