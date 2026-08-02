package defpackage;

import com.yandex.plus.home.feature.webviews.internal.uri.n;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ncu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ncu(int i, Object obj, boolean z, boolean z2) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wxk wxkVar;
        switch (this.a) {
            case 0:
                jil jilVar = (jil) ((sdr) this.d).getValue();
                iil iilVar = jilVar instanceof iil ? (iil) jilVar : null;
                if (iilVar == null || (wxkVar = (wxk) iilVar.a.b.a) == null) {
                    return null;
                }
                if (wxkVar instanceof oxk) {
                    return null;
                }
                if (wxkVar instanceof pxk) {
                    u7g u7gVar = ((pxk) wxkVar).d;
                    if (u7gVar != null) {
                        return new qcu(u7gVar, false, true);
                    }
                    return null;
                }
                if (!(wxkVar instanceof sxk)) {
                    if ((wxkVar instanceof txk) || (wxkVar instanceof uxk)) {
                        return null;
                    }
                    b6e.s();
                    return null;
                }
                u7g u7gVar2 = ((sxk) wxkVar).i;
                if (u7gVar2 == null) {
                    return null;
                }
                if (!this.b || !this.c) {
                    u7gVar2 = null;
                }
                if (u7gVar2 != null) {
                    return new qcu(u7gVar2, true, false);
                }
                return null;
            default:
                Map map = (Map) ((n) this.d).d.getValue();
                String str = this.b ? "COOKIE_INJECT" : null;
                boolean z = this.c;
                return uah.i(map, uah.e(new Pair("available_features", vop.f("BROADCASTING", "UPD_TARGETS", "SMART_WEBVIEW", "CUSTOM_HEADER_V1", "SERVICE_INFORMATION", "MINI_STORIES", str, z ? "BANK" : null, z ? "WALLET" : null, "BACKGROUND_FOREGROUND_MESSAGES", "OVERLAP_MESSAGES", "NATIVE_VIBRATE")), new Pair("smart-view", uop.b("broadcasting"))));
        }
    }
}
