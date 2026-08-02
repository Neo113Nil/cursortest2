package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommandOld;
import ru.yandex.music.common.media.queue.GlagolRemoteQueueStartException;

/* loaded from: classes5.dex */
public final class inf implements u3l {
    public final jyr a = btf.b(new bff(16));
    public final jyr b = btf.b(new bff(17));

    @Override // defpackage.u3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueLaunch.Substituting substituting, es6 es6Var, zrn zrnVar) {
        return b((LaunchGlagolCommandOld) substituting, zrnVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(4:(1:(1:(8:13|14|15|16|(5:21|(2:26|27)|29|(2:31|32)|33)|34|(1:36)|37)(2:46|47))(5:48|49|50|51|52))(7:56|57|58|59|60|(2:62|(2:64|65))(3:66|(2:68|(3:70|51|52))(4:72|(2:79|(2:81|(2:83|84))(2:85|(2:87|37)(2:88|89)))|90|(6:92|16|(5:18|21|(3:23|26|27)|29|(0))|34|(0)|37))|71)|33)|40|(3:42|(1:44)|45)|33)(2:96|97))(6:110|111|112|113|114|(2:116|71))|98|(3:100|(2:102|103)|33)(5:104|(2:106|(2:108|71)(2:109|59))|60|(0)(0)|33)))|121|6|7|(0)(0)|98|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0069, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0094 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, TryCatch #4 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, blocks: (B:60:0x00bf, B:62:0x00cb, B:64:0x00d1, B:66:0x00dd, B:68:0x0124, B:72:0x0168, B:74:0x016c, B:76:0x0170, B:79:0x0175, B:81:0x0179, B:83:0x017f, B:85:0x018d, B:88:0x0192, B:89:0x0197, B:90:0x0198, B:97:0x0065, B:98:0x0081, B:100:0x0094, B:102:0x009a, B:104:0x00a6, B:106:0x00aa, B:114:0x0075), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a6 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, TryCatch #4 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, blocks: (B:60:0x00bf, B:62:0x00cb, B:64:0x00d1, B:66:0x00dd, B:68:0x0124, B:72:0x0168, B:74:0x016c, B:76:0x0170, B:79:0x0175, B:81:0x0179, B:83:0x017f, B:85:0x018d, B:88:0x0192, B:89:0x0197, B:90:0x0198, B:97:0x0065, B:98:0x0081, B:100:0x0094, B:102:0x009a, B:104:0x00a6, B:106:0x00aa, B:114:0x0075), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c9 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0042, TryCatch #3 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0042, blocks: (B:15:0x003d, B:16:0x01a9, B:18:0x01af, B:21:0x01b4, B:23:0x01b8, B:26:0x01bd, B:27:0x01c2, B:29:0x01c3, B:31:0x01c9, B:34:0x01d4, B:36:0x01da), top: B:14:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01da A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0042, TRY_LEAVE, TryCatch #3 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0042, blocks: (B:15:0x003d, B:16:0x01a9, B:18:0x01af, B:21:0x01b4, B:23:0x01b8, B:26:0x01bd, B:27:0x01c2, B:29:0x01c3, B:31:0x01c9, B:34:0x01d4, B:36:0x01da), top: B:14:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, TryCatch #4 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, blocks: (B:60:0x00bf, B:62:0x00cb, B:64:0x00d1, B:66:0x00dd, B:68:0x0124, B:72:0x0168, B:74:0x016c, B:76:0x0170, B:79:0x0175, B:81:0x0179, B:83:0x017f, B:85:0x018d, B:88:0x0192, B:89:0x0197, B:90:0x0198, B:97:0x0065, B:98:0x0081, B:100:0x0094, B:102:0x009a, B:104:0x00a6, B:106:0x00aa, B:114:0x0075), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, TryCatch #4 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0069, blocks: (B:60:0x00bf, B:62:0x00cb, B:64:0x00d1, B:66:0x00dd, B:68:0x0124, B:72:0x0168, B:74:0x016c, B:76:0x0170, B:79:0x0175, B:81:0x0179, B:83:0x017f, B:85:0x018d, B:88:0x0192, B:89:0x0197, B:90:0x0198, B:97:0x0065, B:98:0x0081, B:100:0x0094, B:102:0x009a, B:104:0x00a6, B:106:0x00aa, B:114:0x0075), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(LaunchGlagolCommandOld launchGlagolCommandOld, cg6 cg6Var) {
        hnf hnfVar;
        LaunchGlagolCommandOld launchGlagolCommandOld2;
        LaunchGlagolCommandOld launchGlagolCommandOld3;
        v8n v8nVar;
        LaunchGlagolCommandOld launchGlagolCommandOld4;
        v8n v8nVar2;
        ced cedVar;
        LaunchGlagolCommandOld launchGlagolCommandOld5;
        a0q a0qVar;
        LaunchGlagolCommandOld launchGlagolCommandOld6;
        wdd wddVar;
        Function0 onSuccess;
        Function1 onError;
        if (cg6Var instanceof hnf) {
            hnfVar = (hnf) cg6Var;
            int i = hnfVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnfVar.o = i - Integer.MIN_VALUE;
                Object obj = hnfVar.m;
                nm6 nm6Var = nm6.a;
                launchGlagolCommandOld2 = hnfVar.o;
                r3l r3lVar = r3l.a;
                int i2 = 3;
                s3l s3lVar = s3l.a;
                if (launchGlagolCommandOld2 != 0) {
                    qgg.h0(obj);
                    try {
                        Function1 queueDescriptor = launchGlagolCommandOld.getQueueDescriptor();
                        launchGlagolCommandOld3 = launchGlagolCommandOld;
                        hnfVar.j = launchGlagolCommandOld3;
                        hnfVar.o = 1;
                        obj = queueDescriptor.invoke(hnfVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } catch (PlaybackQueueStartValidator$InvalidQueueException e) {
                        e = e;
                        launchGlagolCommandOld2 = launchGlagolCommandOld;
                    }
                } else {
                    if (launchGlagolCommandOld2 != 1) {
                        if (launchGlagolCommandOld2 == 2) {
                            v8nVar2 = hnfVar.k;
                            launchGlagolCommandOld4 = hnfVar.j;
                            try {
                                qgg.h0(obj);
                                v8nVar = v8nVar2;
                                launchGlagolCommandOld3 = launchGlagolCommandOld4;
                                cedVar = ((odd) this.b.getValue()).l;
                                if (cedVar == null) {
                                    v8nVar.getClass();
                                    a0q a0qVar2 = (a0q) v8nVar.a(new jwl(i2));
                                    u8n P = cxb.P(v8nVar);
                                    String a = v8nVar.c().a();
                                    a0qVar2.getClass();
                                    vgd vgdVar = (vgd) o8g.i(a0qVar2, new xgd(P, true, a, false, null, null));
                                    ssg.a(3, "LaunchGlagolCommandsExecutor", "glagolCastTarget: " + vgdVar, null);
                                    if (Intrinsics.d(vgdVar, rgd.a)) {
                                        v9n v9nVar = new v9n(launchGlagolCommandOld3.getPlayWhenReady(), false, launchGlagolCommandOld3.getQueueStartValidator(), launchGlagolCommandOld3.getOnSuccess(), launchGlagolCommandOld3.getOnError());
                                        dan danVar = (dan) this.a.getValue();
                                        danVar.getClass();
                                        Function2 function2 = (Function2) v8nVar.a(danVar.a);
                                        hnfVar.j = launchGlagolCommandOld3;
                                        hnfVar.k = null;
                                        hnfVar.l = null;
                                        hnfVar.o = 3;
                                        obj = function2.invoke(v9nVar, hnfVar);
                                        if (obj != nm6Var) {
                                            launchGlagolCommandOld6 = launchGlagolCommandOld3;
                                            return new q3l((PlaybackCommand$QueueLaunch.Basic) obj);
                                        }
                                    } else {
                                        if (!(vgdVar instanceof tgd) && !(vgdVar instanceof pgd) && !(vgdVar instanceof ugd)) {
                                            if (!(vgdVar instanceof qgd)) {
                                                if (vgdVar instanceof sgd) {
                                                    return r3lVar;
                                                }
                                                throw new x7j();
                                            }
                                            Function1 onError2 = launchGlagolCommandOld3.getOnError();
                                            if (onError2 != null) {
                                                int i3 = GlagolRemoteQueueStartException.c;
                                                onError2.invoke(ogp.y(a0qVar2, ((qgd) vgdVar).a, null, 4));
                                                return s3lVar;
                                            }
                                        }
                                        hnfVar.j = launchGlagolCommandOld3;
                                        hnfVar.k = null;
                                        hnfVar.l = a0qVar2;
                                        hnfVar.o = 4;
                                        obj = cedVar.g(vgdVar, hnfVar);
                                        if (obj != nm6Var) {
                                            launchGlagolCommandOld5 = launchGlagolCommandOld3;
                                            a0qVar = a0qVar2;
                                            wddVar = (wdd) obj;
                                            if (!(wddVar instanceof tdd)) {
                                                if (!(wddVar instanceof sdd)) {
                                                    throw new x7j();
                                                }
                                                onError = launchGlagolCommandOld5.getOnError();
                                                if (onError != null) {
                                                }
                                            }
                                            onSuccess = launchGlagolCommandOld5.getOnSuccess();
                                            if (onSuccess != null) {
                                            }
                                            return r3lVar;
                                        }
                                    }
                                    return nm6Var;
                                }
                                Function1 onError3 = launchGlagolCommandOld3.getOnError();
                                if (onError3 != null) {
                                    int i4 = GlagolRemoteQueueStartException.c;
                                    onError3.invoke(ogp.y(null, null, "cannot launch queue when glagol is not connected", 2));
                                    return s3lVar;
                                }
                            } catch (PlaybackQueueStartValidator$InvalidQueueException e2) {
                                e = e2;
                                launchGlagolCommandOld2 = launchGlagolCommandOld4;
                            }
                            return s3lVar;
                        }
                        if (launchGlagolCommandOld2 != 3) {
                            if (launchGlagolCommandOld2 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            a0qVar = hnfVar.l;
                            launchGlagolCommandOld5 = hnfVar.j;
                            try {
                                qgg.h0(obj);
                                wddVar = (wdd) obj;
                            } catch (PlaybackQueueStartValidator$InvalidQueueException e3) {
                                e = e3;
                                launchGlagolCommandOld2 = launchGlagolCommandOld5;
                            }
                            if (!(wddVar instanceof tdd) && !(wddVar instanceof udd)) {
                                if (!(wddVar instanceof sdd) && !(wddVar instanceof vdd)) {
                                    throw new x7j();
                                }
                                onError = launchGlagolCommandOld5.getOnError();
                                if (onError != null) {
                                    int i5 = GlagolRemoteQueueStartException.c;
                                    onError.invoke(ogp.y(a0qVar, null, null, 6));
                                    return s3lVar;
                                }
                                return s3lVar;
                            }
                            onSuccess = launchGlagolCommandOld5.getOnSuccess();
                            if (onSuccess != null) {
                                onSuccess.invoke();
                            }
                            return r3lVar;
                        }
                        launchGlagolCommandOld6 = hnfVar.j;
                        try {
                            qgg.h0(obj);
                            return new q3l((PlaybackCommand$QueueLaunch.Basic) obj);
                        } catch (PlaybackQueueStartValidator$InvalidQueueException e4) {
                            e = e4;
                            launchGlagolCommandOld2 = launchGlagolCommandOld6;
                        }
                        ssg.a(6, "LaunchGlagolCommandsExecutor", "execute thrown an exception", e);
                        Function1 onError4 = launchGlagolCommandOld2.getOnError();
                        if (onError4 != null) {
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            onError4.invoke(e);
                        }
                        return s3lVar;
                    }
                    launchGlagolCommandOld3 = hnfVar.j;
                    qgg.h0(obj);
                }
                v8nVar = (v8n) obj;
                v8nVar.getClass();
                if (!((Boolean) v8nVar.a(klx.f)).booleanValue()) {
                    Function1 onError5 = launchGlagolCommandOld3.getOnError();
                    if (onError5 != null) {
                        int i6 = GlagolRemoteQueueStartException.c;
                        onError5.invoke(ogp.y(null, null, "glagol cannot be launched as secondary queue", 2));
                        return s3lVar;
                    }
                    return s3lVar;
                }
                if (v8nVar instanceof igr) {
                    hnfVar.j = launchGlagolCommandOld3;
                    hnfVar.k = v8nVar;
                    hnfVar.o = 2;
                    if (cxb.B((igr) v8nVar, hnfVar) == nm6Var) {
                        return nm6Var;
                    }
                    launchGlagolCommandOld4 = launchGlagolCommandOld3;
                    v8nVar2 = v8nVar;
                    v8nVar = v8nVar2;
                    launchGlagolCommandOld3 = launchGlagolCommandOld4;
                }
                cedVar = ((odd) this.b.getValue()).l;
                if (cedVar == null) {
                }
                return s3lVar;
            }
        }
        hnfVar = new hnf(this, cg6Var);
        Object obj2 = hnfVar.m;
        nm6 nm6Var2 = nm6.a;
        launchGlagolCommandOld2 = hnfVar.o;
        r3l r3lVar2 = r3l.a;
        int i22 = 3;
        s3l s3lVar2 = s3l.a;
        if (launchGlagolCommandOld2 != 0) {
        }
        v8nVar = (v8n) obj2;
        v8nVar.getClass();
        if (!((Boolean) v8nVar.a(klx.f)).booleanValue()) {
        }
    }
}
