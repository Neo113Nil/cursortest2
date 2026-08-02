package defpackage;

import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Banner;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Deeplink;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Div$WithData;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Div$WithJson;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$DynamicOverlaySheet;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Toast;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pi5 {
    public final zj5 a;
    public final dj5 b;
    public final boolean c;
    public final jyr d;
    public final by7 e;
    public final by7 f;

    public pi5(zj5 zj5Var, jyr jyrVar, dj5 dj5Var, boolean z) {
        this.a = zj5Var;
        this.b = dj5Var;
        this.c = z;
        this.d = jyrVar;
        by7 by7Var = ((jk5) zj5Var).l;
        this.e = by7Var;
        this.f = asq.K(by7Var, new z35(12, this));
    }

    public static xh5 a(pi5 pi5Var, String str) {
        pi5Var.getClass();
        return pi5Var.b(str, null);
    }

    public final xh5 b(String str, String str2) {
        Object obj;
        List list = (List) ((Map) this.e.b.invoke()).get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                mte mteVar = (mte) obj;
                if (str2 == null || Intrinsics.d(mteVar.getScreenId(), str2)) {
                    break;
                }
            }
            mte mteVar2 = (mte) obj;
            if (mteVar2 != null) {
                return f(mteVar2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        ki5 ki5Var;
        int i;
        xyo xyoVar;
        mte mteVar;
        if (cg6Var instanceof ki5) {
            ki5Var = (ki5) cg6Var;
            int i2 = ki5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ki5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ki5Var.k;
                nm6 nm6Var = nm6.a;
                i = ki5Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ki5Var.j = str;
                    ki5Var.m = 1;
                    obj = ((jk5) this.a).b(30000L, ki5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = ki5Var.j;
                    qgg.h0(obj);
                }
                xyoVar = (xyo) obj;
                if (!(xyoVar instanceof vyo)) {
                    vyo vyoVar = (vyo) xyoVar;
                    return new vyo(vyoVar.b, vyoVar.a);
                }
                if (xyoVar instanceof wyo) {
                    List list = (List) ((Map) ((wyo) xyoVar).a).get(str);
                    return new wyo((list == null || (mteVar = (mte) CollectionsKt.firstOrNull(list)) == null) ? null : f(mteVar));
                }
                b6e.s();
                return null;
            }
        }
        ki5Var = new ki5(this, cg6Var);
        Object obj2 = ki5Var.k;
        nm6 nm6Var2 = nm6.a;
        i = ki5Var.m;
        if (i != 0) {
        }
        xyoVar = (xyo) obj2;
        if (!(xyoVar instanceof vyo)) {
        }
    }

    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        jk5 jk5Var = (jk5) this.a;
        x97.y(jk5Var.h, null, null, new rc4(jk5Var, str, str2, null, 17), 3);
    }

    public final void e(String str) {
        str.getClass();
        jk5 jk5Var = (jk5) this.a;
        x97.y(jk5Var.h, null, null, new vv4(jk5Var, str, (Continuation) null, 5), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xh5 f(mte mteVar) {
        zg5 zg5Var;
        bh5 bh5Var;
        qj5 qj5Var = (qj5) ((oj5) this.d.getValue());
        qj5Var.getClass();
        if (mteVar instanceof InternalCommunicationTrigger$Banner) {
            InternalCommunicationTrigger$Banner internalCommunicationTrigger$Banner = (InternalCommunicationTrigger$Banner) mteVar;
            String screenId = internalCommunicationTrigger$Banner.getScreenId();
            String feedbackToken = internalCommunicationTrigger$Banner.getFeedbackToken();
            qh5 a = qj5.a(internalCommunicationTrigger$Banner.getMeta());
            InternalCommunicationTrigger$Banner.Data data = internalCommunicationTrigger$Banner.getData();
            String title = data.getTitle();
            String subtitle = data.getSubtitle();
            String imageUrl = data.getImageUrl();
            InternalCommunicationTrigger$Banner.Data.Theme lightTheme = data.getLightTheme();
            bh5 bh5Var2 = lightTheme != null ? new bh5(lightTheme.getTitleColor(), lightTheme.getSubtitleColor(), lightTheme.getBgColor(), lightTheme.getBgUrl()) : null;
            InternalCommunicationTrigger$Banner.Data.Theme darkTheme = data.getDarkTheme();
            if (darkTheme != null) {
                zg5Var = null;
                bh5Var = new bh5(darkTheme.getTitleColor(), darkTheme.getSubtitleColor(), darkTheme.getBgColor(), darkTheme.getBgUrl());
            } else {
                zg5Var = null;
                bh5Var = null;
            }
            InternalCommunicationTrigger$Banner.Data.Action action = data.getAction();
            zg5 zg5Var2 = action != null ? new zg5(action.getUri(), action.getId()) : zg5Var;
            InternalCommunicationTrigger$Banner.Data.Adv adv = data.getAdv();
            return new dh5(screenId, feedbackToken, a, new ch5(title, subtitle, imageUrl, bh5Var2, bh5Var, zg5Var2, adv != null ? new ah5(adv.getText()) : zg5Var));
        }
        if (mteVar instanceof InternalCommunicationTrigger$Deeplink) {
            InternalCommunicationTrigger$Deeplink internalCommunicationTrigger$Deeplink = (InternalCommunicationTrigger$Deeplink) mteVar;
            return new lh5(internalCommunicationTrigger$Deeplink.getScreenId(), internalCommunicationTrigger$Deeplink.getFeedbackToken(), qj5.a(internalCommunicationTrigger$Deeplink.getMeta()), internalCommunicationTrigger$Deeplink.getDeeplink());
        }
        if (mteVar instanceof InternalCommunicationTrigger$Div$WithData) {
            InternalCommunicationTrigger$Div$WithData internalCommunicationTrigger$Div$WithData = (InternalCommunicationTrigger$Div$WithData) mteVar;
            return new mh5(internalCommunicationTrigger$Div$WithData.getScreenId(), internalCommunicationTrigger$Div$WithData.getFeedbackToken(), qj5.a(internalCommunicationTrigger$Div$WithData.getMeta()), internalCommunicationTrigger$Div$WithData.getDiv());
        }
        if (mteVar instanceof InternalCommunicationTrigger$Div$WithJson) {
            InternalCommunicationTrigger$Div$WithJson internalCommunicationTrigger$Div$WithJson = (InternalCommunicationTrigger$Div$WithJson) mteVar;
            xyo b = qj5Var.a.b(internalCommunicationTrigger$Div$WithJson.getDiv());
            if (b instanceof vyo) {
                return null;
            }
            if (b instanceof wyo) {
                return new mh5(internalCommunicationTrigger$Div$WithJson.getScreenId(), internalCommunicationTrigger$Div$WithJson.getFeedbackToken(), qj5.a(internalCommunicationTrigger$Div$WithJson.getMeta()), (rv8) ((wyo) b).a);
            }
            b6e.s();
            return null;
        }
        if (!(mteVar instanceof InternalCommunicationTrigger$DynamicOverlaySheet)) {
            if (!(mteVar instanceof InternalCommunicationTrigger$Toast)) {
                b6e.s();
                return null;
            }
            InternalCommunicationTrigger$Toast internalCommunicationTrigger$Toast = (InternalCommunicationTrigger$Toast) mteVar;
            String screenId2 = internalCommunicationTrigger$Toast.getScreenId();
            String feedbackToken2 = internalCommunicationTrigger$Toast.getFeedbackToken();
            qh5 a2 = qj5.a(internalCommunicationTrigger$Toast.getMeta());
            InternalCommunicationTrigger$Toast.Data data2 = internalCommunicationTrigger$Toast.getData();
            if (pj5.b[data2.getToastType().ordinal()] != 1) {
                b6e.s();
                return null;
            }
            th5 th5Var = th5.b;
            String title2 = data2.getTitle();
            String subtitle2 = data2.getSubtitle();
            String imageUrl2 = data2.getImageUrl();
            InternalCommunicationTrigger$Toast.Data.Action action2 = data2.getAction();
            rh5 rh5Var = action2 != null ? new rh5(action2.getUri(), action2.getId()) : null;
            InternalCommunicationTrigger$Toast.Data.Timers timers = data2.getTimers();
            return new vh5(screenId2, feedbackToken2, a2, new uh5(th5Var, title2, subtitle2, imageUrl2, rh5Var, timers != null ? new sh5(timers.getDelayBeforeShow(), timers.getDelayBeforeDismiss()) : null));
        }
        InternalCommunicationTrigger$DynamicOverlaySheet internalCommunicationTrigger$DynamicOverlaySheet = (InternalCommunicationTrigger$DynamicOverlaySheet) mteVar;
        String screenId3 = internalCommunicationTrigger$DynamicOverlaySheet.getScreenId();
        String feedbackToken3 = internalCommunicationTrigger$DynamicOverlaySheet.getFeedbackToken();
        qh5 a3 = qj5.a(internalCommunicationTrigger$DynamicOverlaySheet.getMeta());
        InternalCommunicationTrigger$DynamicOverlaySheet.Data data3 = internalCommunicationTrigger$DynamicOverlaySheet.getData();
        boolean canBeOpened = data3.getCanBeOpened();
        boolean isCenterAlign = data3.getIsCenterAlign();
        String headerText = data3.getHeaderText();
        String headerColor = data3.getHeaderColor();
        boolean bigHeader = data3.getBigHeader();
        String subtitleText = data3.getSubtitleText();
        String subtitleColor = data3.getSubtitleColor();
        String firstButtonText = data3.getFirstButtonText();
        InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction firstButtonAction = data3.getFirstButtonAction();
        nh5 nh5Var = new nh5(firstButtonAction.getUri(), firstButtonAction.getId());
        String firstButtonColor = data3.getFirstButtonColor();
        String firstButtonTextColor = data3.getFirstButtonTextColor();
        String secondButtonText = data3.getSecondButtonText();
        InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction secondButtonAction = data3.getSecondButtonAction();
        return new ph5(screenId3, feedbackToken3, a3, new oh5(canBeOpened, isCenterAlign, headerText, headerColor, bigHeader, subtitleText, subtitleColor, firstButtonText, nh5Var, firstButtonColor, firstButtonTextColor, secondButtonText, secondButtonAction != null ? new nh5(secondButtonAction.getUri(), secondButtonAction.getId()) : null, data3.getSecondButtonColor(), data3.getSecondButtonTextColor(), data3.getCloseButtonColor(), data3.getEridButtonColor(), data3.getAdvDisclaimer(), data3.getDisclaimerText(), data3.getDisclaimerColor(), data3.getImageUrl(), data3.getBackgroundColor(), data3.getBackgroundImageUrl()));
    }
}
