package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewNavigationEntry$Type;
import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$NavigationButton;
import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$ScreenType;
import com.yandex.go.quark.dynamic.h;

/* loaded from: classes13.dex */
public final class wl1 extends ad5 {
    public final nl1 A;
    public final xgg0 B;
    public final String C;
    public o8g0 D;
    public final rl1 x;
    public final ryh y;
    public final kl1 z;

    public wl1(rl1 rl1Var, ryh ryhVar, kl1 kl1Var, nl1 nl1Var, xgg0 xgg0Var, String str) {
        super(ul1.class);
        this.x = rl1Var;
        this.y = ryhVar;
        this.z = kl1Var;
        this.A = nl1Var;
        this.B = xgg0Var;
        this.C = str;
    }

    public final void Kg(AiAssistantAnalytics$NavigationButton aiAssistantAnalytics$NavigationButton) {
        vdb c;
        ChatViewNavigationEntry$Type chatViewNavigationEntry$Type;
        int i;
        String str = this.B.a;
        o8g0 o8g0Var = this.D;
        AiAssistantAnalytics$ScreenType aiAssistantAnalytics$ScreenType = null;
        if (o8g0Var != null && (c = h.c((h) o8g0Var.a, (gxz0) ((se41) o8g0Var.b).o.e.a.getValue())) != null && (chatViewNavigationEntry$Type = c.b) != null && (i = vl1.a[chatViewNavigationEntry$Type.ordinal()]) != 1 && i != 2 && i != 3) {
            if (i == 4) {
                aiAssistantAnalytics$ScreenType = AiAssistantAnalytics$ScreenType.Chat;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                aiAssistantAnalytics$ScreenType = AiAssistantAnalytics$ScreenType.History;
            }
        }
        this.z.a(str, aiAssistantAnalytics$NavigationButton, aiAssistantAnalytics$ScreenType);
    }
}
