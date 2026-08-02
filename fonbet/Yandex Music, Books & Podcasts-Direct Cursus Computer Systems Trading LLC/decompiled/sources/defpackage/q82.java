package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.fragment.app.t;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.impl.C0479n3;
import ru.yandex.music.wizard3.WizardActivity;

/* loaded from: classes5.dex */
public final class q82 {
    public static final /* synthetic */ s9f[] h = {new yxm(q82.class, C0479n3.g, "getBackground()Landroid/widget/ImageView;", 0), f1d.c(ern.a, q82.class, "cover", "getCover()Lru/yandex/music/ui/view/CoverView;", 0), new yxm(q82.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(q82.class, DeviceService.KEY_DESC, "getDescription()Landroid/widget/TextView;", 0), new yxm(q82.class, "button", "getButton()Landroid/widget/Button;", 0), new yxm(q82.class, "createButton", "getCreateButton()Landroid/widget/Button;", 0), new yxm(q82.class, "close", "getClose()Landroid/widget/ImageButton;", 0)};
    public final q13 a;
    public final q13 b;
    public final q13 c;
    public final q13 d;
    public final q13 e;
    public final q13 f;
    public sld g;

    public q82(Context context, View view) {
        view.getClass();
        context.getClass();
        this.a = new q13(new ql(view, 4));
        this.b = new q13(new ql(view, 5));
        this.c = new q13(new ql(view, 6));
        this.d = new q13(new ql(view, 7));
        q13 q13Var = new q13(new ql(view, 8));
        this.e = q13Var;
        q13 q13Var2 = new q13(new ql(view, 9));
        this.f = q13Var2;
        q13 q13Var3 = new q13(new ql(view, 10));
        s9f[] s9fVarArr = h;
        ImageButton imageButton = (ImageButton) q13Var3.a(s9fVarArr[6]);
        imageButton.getClass();
        qdq.j(imageButton, new jn1(2, false));
        final int i = 0;
        ((Button) q13Var.a(s9fVarArr[4])).setOnClickListener(new View.OnClickListener(this) { // from class: p82
            public final /* synthetic */ q82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                t l;
                t l2;
                int i2 = i;
                q82 q82Var = this.b;
                switch (i2) {
                    case 0:
                        sld sldVar = q82Var.g;
                        if (sldVar != null && (l = ((o82) ((ix6) sldVar.b).b).l()) != null) {
                            l.supportFinishAfterTransition();
                            break;
                        }
                        break;
                    case 1:
                        sld sldVar2 = q82Var.g;
                        if (sldVar2 != null) {
                            ix6 ix6Var = (ix6) sldVar2.b;
                            ot0.A(xif.b.e(), "ShowWizard_From_AutoPlaylistsLandingBlock", null);
                            o82 o82Var = (o82) ix6Var.b;
                            t l3 = o82Var.l();
                            if (l3 != null) {
                                l3.supportFinishAfterTransition();
                            }
                            int i3 = WizardActivity.v;
                            Context context2 = o82Var.getContext();
                            context2.getClass();
                            Intent intent = new Intent(context2, (Class<?>) WizardActivity.class);
                            intent.putExtra("show_onboarding", false);
                            o82Var.startActivity(intent);
                            break;
                        }
                        break;
                    default:
                        sld sldVar3 = q82Var.g;
                        if (sldVar3 != null && (l2 = ((o82) ((ix6) sldVar3.b).b).l()) != null) {
                            l2.supportFinishAfterTransition();
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        ((Button) q13Var2.a(s9fVarArr[5])).setOnClickListener(new View.OnClickListener(this) { // from class: p82
            public final /* synthetic */ q82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                t l;
                t l2;
                int i22 = i2;
                q82 q82Var = this.b;
                switch (i22) {
                    case 0:
                        sld sldVar = q82Var.g;
                        if (sldVar != null && (l = ((o82) ((ix6) sldVar.b).b).l()) != null) {
                            l.supportFinishAfterTransition();
                            break;
                        }
                        break;
                    case 1:
                        sld sldVar2 = q82Var.g;
                        if (sldVar2 != null) {
                            ix6 ix6Var = (ix6) sldVar2.b;
                            ot0.A(xif.b.e(), "ShowWizard_From_AutoPlaylistsLandingBlock", null);
                            o82 o82Var = (o82) ix6Var.b;
                            t l3 = o82Var.l();
                            if (l3 != null) {
                                l3.supportFinishAfterTransition();
                            }
                            int i3 = WizardActivity.v;
                            Context context2 = o82Var.getContext();
                            context2.getClass();
                            Intent intent = new Intent(context2, (Class<?>) WizardActivity.class);
                            intent.putExtra("show_onboarding", false);
                            o82Var.startActivity(intent);
                            break;
                        }
                        break;
                    default:
                        sld sldVar3 = q82Var.g;
                        if (sldVar3 != null && (l2 = ((o82) ((ix6) sldVar3.b).b).l()) != null) {
                            l2.supportFinishAfterTransition();
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        ((ImageButton) q13Var3.a(s9fVarArr[6])).setOnClickListener(new View.OnClickListener(this) { // from class: p82
            public final /* synthetic */ q82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                t l;
                t l2;
                int i22 = i3;
                q82 q82Var = this.b;
                switch (i22) {
                    case 0:
                        sld sldVar = q82Var.g;
                        if (sldVar != null && (l = ((o82) ((ix6) sldVar.b).b).l()) != null) {
                            l.supportFinishAfterTransition();
                            break;
                        }
                        break;
                    case 1:
                        sld sldVar2 = q82Var.g;
                        if (sldVar2 != null) {
                            ix6 ix6Var = (ix6) sldVar2.b;
                            ot0.A(xif.b.e(), "ShowWizard_From_AutoPlaylistsLandingBlock", null);
                            o82 o82Var = (o82) ix6Var.b;
                            t l3 = o82Var.l();
                            if (l3 != null) {
                                l3.supportFinishAfterTransition();
                            }
                            int i32 = WizardActivity.v;
                            Context context2 = o82Var.getContext();
                            context2.getClass();
                            Intent intent = new Intent(context2, (Class<?>) WizardActivity.class);
                            intent.putExtra("show_onboarding", false);
                            o82Var.startActivity(intent);
                            break;
                        }
                        break;
                    default:
                        sld sldVar3 = q82Var.g;
                        if (sldVar3 != null && (l2 = ((o82) ((ix6) sldVar3.b).b).l()) != null) {
                            l2.supportFinishAfterTransition();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
