package defpackage;

import com.yandex.music.screen.landing.api.header.ui.view.HeaderContentViewFrameLayout;
import com.yandex.music.screen.landing.api.header.ui.view.SpecialHeaderBackgroundView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class e6r {
    public static final /* synthetic */ s9f[] g;
    public final HeaderContentViewFrameLayout a;
    public final SpecialHeaderBackgroundView b;
    public c5p c;
    public final d6r d;
    public final d6r e;
    public final d6r f;

    static {
        opi opiVar = new opi(e6r.class, "alpha", "getAlpha()F", 0);
        ern.a.getClass();
        g = new s9f[]{opiVar, new opi(e6r.class, "logoColor", "getLogoColor-QN2ZGVo()Landroidx/compose/ui/graphics/Color;", 0), new opi(e6r.class, "collapsedMode", "getCollapsedMode()Z", 0)};
    }

    public e6r(HeaderContentViewFrameLayout headerContentViewFrameLayout, SpecialHeaderBackgroundView specialHeaderBackgroundView) {
        headerContentViewFrameLayout.getClass();
        specialHeaderBackgroundView.getClass();
        this.a = headerContentViewFrameLayout;
        this.b = specialHeaderBackgroundView;
        this.d = new d6r(this, 0);
        this.e = new d6r(this, 1);
        this.f = new d6r(this, 2);
        headerContentViewFrameLayout.setClickListener(new kzp(17, this));
        final int i = 0;
        headerContentViewFrameLayout.setRunLottieListener(new Function0(this) { // from class: c6r
            public final /* synthetic */ e6r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                e6r e6rVar = this.b;
                switch (i2) {
                    case 0:
                        e6rVar.b.r();
                        break;
                    default:
                        c5p c5pVar = e6rVar.c;
                        if (c5pVar != null) {
                            kj3 kj3Var = ((z5r) c5pVar.b).c;
                            String str = (String) kj3Var.e;
                            if (str != null && !kj3Var.b) {
                                kj3Var.b = true;
                                nmb nmbVar = f6r.a;
                                String G = ((fnb) kj3Var.d).G();
                                G.getClass();
                                nmb nmbVar2 = f6r.a;
                                nmbVar2.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("page_type", "landing");
                                linkedHashMap.put("page_id", "main");
                                linkedHashMap.put("hash", G);
                                linkedHashMap.put("entity_id", "SpecialProjectButton");
                                linkedHashMap.put("entity_name", str);
                                linkedHashMap.put("entity_pos", CommonUrlParts.Values.FALSE_INTEGER);
                                dfi.p(1, "entity_type", "special_project", "_meta", linkedHashMap);
                                nmbVar2.C("Home.SpecialProjectButton.Showed", linkedHashMap);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        });
        final int i2 = 1;
        headerContentViewFrameLayout.setButtonShownListener(new Function0(this) { // from class: c6r
            public final /* synthetic */ e6r b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                e6r e6rVar = this.b;
                switch (i22) {
                    case 0:
                        e6rVar.b.r();
                        break;
                    default:
                        c5p c5pVar = e6rVar.c;
                        if (c5pVar != null) {
                            kj3 kj3Var = ((z5r) c5pVar.b).c;
                            String str = (String) kj3Var.e;
                            if (str != null && !kj3Var.b) {
                                kj3Var.b = true;
                                nmb nmbVar = f6r.a;
                                String G = ((fnb) kj3Var.d).G();
                                G.getClass();
                                nmb nmbVar2 = f6r.a;
                                nmbVar2.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("page_type", "landing");
                                linkedHashMap.put("page_id", "main");
                                linkedHashMap.put("hash", G);
                                linkedHashMap.put("entity_id", "SpecialProjectButton");
                                linkedHashMap.put("entity_name", str);
                                linkedHashMap.put("entity_pos", CommonUrlParts.Values.FALSE_INTEGER);
                                dfi.p(1, "entity_type", "special_project", "_meta", linkedHashMap);
                                nmbVar2.C("Home.SpecialProjectButton.Showed", linkedHashMap);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        });
    }
}
