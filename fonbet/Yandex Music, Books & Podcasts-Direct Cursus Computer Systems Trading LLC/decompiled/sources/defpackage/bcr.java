package defpackage;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bcr implements o3l {
    public final uoh a;
    public final q4d b;
    public final f4d c;
    public final c4d d;
    public final b5d e;
    public final j4d f;
    public final Function0 g;

    public bcr(uoh uohVar, q4d q4dVar, f4d f4dVar, c4d c4dVar, b5d b5dVar, j4d j4dVar, Function0 function0) {
        q4dVar.getClass();
        f4dVar.getClass();
        c4dVar.getClass();
        b5dVar.getClass();
        j4dVar.getClass();
        this.a = uohVar;
        this.b = q4dVar;
        this.c = f4dVar;
        this.d = c4dVar;
        this.e = b5dVar;
        this.f = j4dVar;
        this.g = function0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|8|(1:(1:(7:12|13|14|(1:16)|18|19|20)(2:22|23))(4:24|25|26|27))(3:41|42|(2:44|30))|28))|46|6|7|8|(0)(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (r4.a(r13, r6, r7, r8, false, r10) != r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    @Override // defpackage.o3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartGenerativeQueueCommand startGenerativeQueueCommand, es6 es6Var, cg6 cg6Var) {
        acr acrVar;
        int i;
        boolean z;
        es6 es6Var2;
        StartGenerativeQueueCommand startGenerativeQueueCommand2 = startGenerativeQueueCommand;
        if (cg6Var instanceof acr) {
            acrVar = (acr) cg6Var;
            int i2 = acrVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acrVar.n = i2 - Integer.MIN_VALUE;
                acr acrVar2 = acrVar;
                Object obj = acrVar2.l;
                nm6 nm6Var = nm6.a;
                i = acrVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "StartGenerativeQueueCommandsExecutor", "Starting queue with " + startGenerativeQueueCommand2, null);
                    Function1 queueDescriptor = startGenerativeQueueCommand2.getQueueDescriptor();
                    acrVar2.j = startGenerativeQueueCommand2;
                    es6Var2 = es6Var;
                    acrVar2.k = es6Var2;
                    acrVar2.n = 1;
                    obj = queueDescriptor.invoke(acrVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        startGenerativeQueueCommand2 = acrVar2.j;
                        qgg.h0(obj);
                        Function0 onSuccess = startGenerativeQueueCommand2.getOnSuccess();
                        if (onSuccess != null) {
                            onSuccess.invoke();
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    es6 es6Var3 = acrVar2.k;
                    StartGenerativeQueueCommand startGenerativeQueueCommand3 = acrVar2.j;
                    try {
                        qgg.h0(obj);
                        es6Var2 = es6Var3;
                        startGenerativeQueueCommand2 = startGenerativeQueueCommand3;
                    } catch (PlaybackQueueStartValidator$InvalidQueueException e) {
                        e = e;
                        startGenerativeQueueCommand2 = startGenerativeQueueCommand3;
                        ssg.a(6, "StartGenerativeQueueCommandsExecutor", "execute thrown an exception", e);
                        Function1 onError = startGenerativeQueueCommand2.getOnError();
                        if (onError != null) {
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            onError.invoke(e);
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                f7l f7lVar = (f7l) es6Var2.a;
                b1q.b.getClass();
                nq7 nq7Var = new nq7((k7q) obj, startGenerativeQueueCommand2.getStartRequest(), f7lVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
                v4d v4dVar = new v4d();
                g4l g4lVar = (g4l) es6Var2.b;
                boolean playWhenReady = startGenerativeQueueCommand2.getPlayWhenReady();
                y3l queueStartValidator = startGenerativeQueueCommand2.getQueueStartValidator();
                acrVar2.j = startGenerativeQueueCommand2;
                acrVar2.k = null;
                acrVar2.n = 2;
            }
        }
        acrVar = new acr(this, cg6Var);
        acr acrVar22 = acrVar;
        Object obj2 = acrVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = acrVar22.n;
        if (i != 0) {
        }
        f7l f7lVar2 = (f7l) es6Var2.a;
        b1q.b.getClass();
        nq7 nq7Var2 = new nq7((k7q) obj2, startGenerativeQueueCommand2.getStartRequest(), f7lVar2, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        v4d v4dVar2 = new v4d();
        g4l g4lVar2 = (g4l) es6Var2.b;
        boolean playWhenReady2 = startGenerativeQueueCommand2.getPlayWhenReady();
        y3l queueStartValidator2 = startGenerativeQueueCommand2.getQueueStartValidator();
        acrVar22.j = startGenerativeQueueCommand2;
        acrVar22.k = null;
        acrVar22.n = 2;
    }
}
