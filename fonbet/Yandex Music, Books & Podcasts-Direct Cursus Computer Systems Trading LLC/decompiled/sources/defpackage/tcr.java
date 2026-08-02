package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.control.shared.commands.StartQueueIntoYnisonRemoteCommandOld;
import ru.yandex.music.common.media.queue.YnisonSecondaryQueuePassiveLaunchException;

/* loaded from: classes5.dex */
public final class tcr implements u3l {
    public static final String b = "YnisonApp:".concat("StartQueueIntoYnisonRemoteCommandsExecutor");
    public final jyr a = l18.b.b(hag.I(afw.class), true);

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(7:12|13|14|15|(1:17)|18|19)(2:30|31))(5:32|33|34|(5:37|15|(0)|18|19)|36))(2:38|39))(3:49|50|(2:52|36))|40|(3:42|(2:44|45)|29)(5:46|(2:48|36)|34|(0)|36)))|55|6|7|(0)(0)|40|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0046, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        r11 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0035, TryCatch #0 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0035, blocks: (B:14:0x0030, B:15:0x00d1, B:17:0x00e2, B:18:0x00e5), top: B:13:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0046, TryCatch #1 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0046, blocks: (B:33:0x0041, B:34:0x00b6, B:39:0x0050, B:40:0x0068, B:42:0x007b, B:44:0x0081, B:46:0x008c, B:50:0x0057), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0046, TryCatch #1 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0046, blocks: (B:33:0x0041, B:34:0x00b6, B:39:0x0050, B:40:0x0068, B:42:0x007b, B:44:0x0081, B:46:0x008c, B:50:0x0057), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.u3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartQueueIntoYnisonRemoteCommandOld startQueueIntoYnisonRemoteCommandOld, es6 es6Var, cg6 cg6Var) {
        rcr rcrVar;
        int i;
        StartQueueIntoYnisonRemoteCommandOld startQueueIntoYnisonRemoteCommandOld2;
        v8n v8nVar;
        oow oowVar;
        y3l queueStartValidator;
        scr scrVar;
        oow oowVar2;
        Function0 onSuccess;
        if (cg6Var instanceof rcr) {
            rcrVar = (rcr) cg6Var;
            int i2 = rcrVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rcrVar.o = i2 - Integer.MIN_VALUE;
                Object obj = rcrVar.m;
                nm6 nm6Var = nm6.a;
                i = rcrVar.o;
                s3l s3lVar = s3l.a;
                if (i != 0) {
                    qgg.h0(obj);
                    Function1 queueDescriptor = startQueueIntoYnisonRemoteCommandOld.getQueueDescriptor();
                    rcrVar.j = startQueueIntoYnisonRemoteCommandOld;
                    rcrVar.k = es6Var;
                    rcrVar.o = 1;
                    obj = queueDescriptor.invoke(rcrVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            startQueueIntoYnisonRemoteCommandOld = rcrVar.j;
                            qgg.h0(obj);
                            oowVar = (oow) obj;
                            queueStartValidator = startQueueIntoYnisonRemoteCommandOld.getQueueStartValidator();
                            scrVar = scr.a;
                            rcrVar.j = startQueueIntoYnisonRemoteCommandOld;
                            rcrVar.k = null;
                            rcrVar.l = oowVar;
                            rcrVar.o = 3;
                            if (a0g.O(queueStartValidator, oowVar, scrVar, rcrVar) != nm6Var) {
                                startQueueIntoYnisonRemoteCommandOld2 = startQueueIntoYnisonRemoteCommandOld;
                                oowVar2 = oowVar;
                                ((afw) this.a.getValue()).h(oowVar2);
                                onSuccess = startQueueIntoYnisonRemoteCommandOld2.getOnSuccess();
                                if (onSuccess != null) {
                                }
                                return r3l.a;
                            }
                            return nm6Var;
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oowVar2 = rcrVar.l;
                        startQueueIntoYnisonRemoteCommandOld2 = rcrVar.j;
                        try {
                            qgg.h0(obj);
                            ((afw) this.a.getValue()).h(oowVar2);
                            onSuccess = startQueueIntoYnisonRemoteCommandOld2.getOnSuccess();
                            if (onSuccess != null) {
                                onSuccess.invoke();
                            }
                            return r3l.a;
                        } catch (PlaybackQueueStartValidator$InvalidQueueException e) {
                            Throwable e2 = e;
                            ssg.a(6, b, "execute thrown an exception", e2);
                            Function1 onError = startQueueIntoYnisonRemoteCommandOld2.getOnError();
                            if (onError != null) {
                                Throwable cause = e2.getCause();
                                if (cause != null) {
                                    e2 = cause;
                                }
                                onError.invoke(e2);
                            }
                            return s3lVar;
                        }
                    }
                    es6Var = rcrVar.k;
                    startQueueIntoYnisonRemoteCommandOld = rcrVar.j;
                    qgg.h0(obj);
                }
                v8nVar = (v8n) obj;
                v8nVar.getClass();
                if (!((Boolean) v8nVar.a(klx.f)).booleanValue()) {
                    Function1 onError2 = startQueueIntoYnisonRemoteCommandOld.getOnError();
                    if (onError2 != null) {
                        onError2.invoke(new YnisonSecondaryQueuePassiveLaunchException("Cannot launch queue as secondary to ynison passive device", null));
                        return s3lVar;
                    }
                    return s3lVar;
                }
                boolean playWhenReady = startQueueIntoYnisonRemoteCommandOld.getPlayWhenReady();
                h4q h4qVar = (h4q) ((uol) es6Var.c).j.a.getValue();
                rcrVar.j = startQueueIntoYnisonRemoteCommandOld;
                rcrVar.k = null;
                rcrVar.o = 2;
                obj = ((eiw) v8nVar.a(new bz2(playWhenReady, h4qVar))).a(rcrVar);
                if (obj == nm6Var) {
                    return nm6Var;
                }
                oowVar = (oow) obj;
                queueStartValidator = startQueueIntoYnisonRemoteCommandOld.getQueueStartValidator();
                scrVar = scr.a;
                rcrVar.j = startQueueIntoYnisonRemoteCommandOld;
                rcrVar.k = null;
                rcrVar.l = oowVar;
                rcrVar.o = 3;
                if (a0g.O(queueStartValidator, oowVar, scrVar, rcrVar) != nm6Var) {
                }
                return nm6Var;
            }
        }
        rcrVar = new rcr(this, cg6Var);
        Object obj2 = rcrVar.m;
        nm6 nm6Var2 = nm6.a;
        i = rcrVar.o;
        s3l s3lVar2 = s3l.a;
        if (i != 0) {
        }
        v8nVar = (v8n) obj2;
        v8nVar.getClass();
        if (!((Boolean) v8nVar.a(klx.f)).booleanValue()) {
        }
    }
}
