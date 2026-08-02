package defpackage;

import android.net.Uri;
import android.view.View;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.screens.notice.presentation.TopupNoticeContentView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.tooltip.TooltipCommon$DismissReason;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes3.dex */
public final /* synthetic */ class uwl0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ uwl0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onAdLabelClickListener$lambda$5;
        zy11 onLinkClickListener$lambda$4;
        Tooltip$DismissReason tooltip$DismissReason;
        boolean onDivAction$lambda$2;
        int i = this.a;
        int i2 = 3;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new xwl0((String) obj));
                return zy11Var;
            case 1:
                tlsVar.invoke(obj);
                return zy11Var;
            case 2:
                tlsVar.invoke((String) obj);
                return zy11Var;
            case 3:
                tlsVar.invoke((String) obj);
                return zy11Var;
            case 4:
                n70 n70Var = (n70) obj;
                n70Var.W(new ms3(4, n70Var, tlsVar));
                return zy11Var;
            case 5:
                return new far0((yss0) ((View) obj), tlsVar);
            case 6:
                tlsVar.invoke((String) obj);
                return zy11Var;
            case 7:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new ms3(5, n70Var2, tlsVar));
                return zy11Var;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    tlsVar.invoke(SettingsTheme.LIGHT);
                }
                return zy11Var;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    tlsVar.invoke(SettingsTheme.DARK);
                }
                return zy11Var;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    tlsVar.invoke(SettingsTheme.SYSTEM);
                }
                return zy11Var;
            case 11:
                return new mt6((ListItemCheckComponent) obj, tlsVar, i2);
            case 12:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    tlsVar.invoke(new dys0(uri));
                }
                return zy11Var;
            case 13:
                n70 n70Var3 = (n70) obj;
                n70Var3.W(new ms3(6, n70Var3, tlsVar));
                return zy11Var;
            case 14:
                return tlsVar.invoke(new f4u0(obj));
            case 15:
                onAdLabelClickListener$lambda$5 = StoriesComponentView.setOnAdLabelClickListener$lambda$5(tlsVar, (String) obj);
                return onAdLabelClickListener$lambda$5;
            case 16:
                onLinkClickListener$lambda$4 = StoriesComponentView.setOnLinkClickListener$lambda$4(tlsVar, (String) obj);
                return onLinkClickListener$lambda$4;
            case 17:
                tlsVar.invoke((String) obj);
                return zy11Var;
            case 18:
                n70 n70Var4 = (n70) obj;
                n70Var4.W(new ms3(8, n70Var4, tlsVar));
                return zy11Var;
            case 19:
                n70 n70Var5 = (n70) obj;
                n70Var5.W(new ms3(7, n70Var5, tlsVar));
                return zy11Var;
            case 20:
                return new w50(19, tlsVar);
            case 21:
                Long l = (Long) obj;
                l.getClass();
                return tlsVar.invoke(l);
            case 22:
                tlsVar.invoke(new cvx0(((Integer) obj).intValue()));
                return zy11Var;
            case 23:
                tlsVar.invoke(new dvx0((String) obj));
                return zy11Var;
            case 24:
                tlsVar.invoke(new cvx0(((Integer) obj).intValue()));
                return zy11Var;
            case 25:
                return (rbv) tlsVar.invoke((String) obj);
            case 26:
                tlsVar.invoke(new n3z0((String) obj));
                return zy11Var;
            case 27:
                tlsVar.invoke(new n3z0((String) obj));
                return zy11Var;
            case 28:
                int i3 = auz0.c[((TooltipCommon$DismissReason) obj).ordinal()];
                if (i3 == 1) {
                    tooltip$DismissReason = Tooltip$DismissReason.CLICK;
                } else if (i3 == 2) {
                    tooltip$DismissReason = Tooltip$DismissReason.TIMEOUT;
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    tooltip$DismissReason = Tooltip$DismissReason.OUTSIDE_ACTION;
                }
                tlsVar.invoke(tooltip$DismissReason);
                return zy11Var;
            default:
                onDivAction$lambda$2 = TopupNoticeContentView.onDivAction$lambda$2(tlsVar, (Uri) obj);
                return Boolean.valueOf(onDivAction$lambda$2);
        }
    }
}
