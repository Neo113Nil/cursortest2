package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.messaging.ui.folders.selectDialog.SelectFolderDialogFragment;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public final class xs4 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xs4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        fid fidVar = (fid) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= fidVar.a(booleanValue) ? 32 : 16;
        }
        if ((intValue & 145) == 144) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        if (!booleanValue) {
            sls slsVar = (sls) this.b;
            sls slsVar2 = (sls) this.c;
            sic a = qic.a(lr20.c, x4c.G, fidVar, 0);
            bts btsVar2 = (bts) fidVar;
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            c530 c530Var = c530.a;
            f530 d = b.d(fidVar, c530Var);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            bts btsVar3 = (bts) fidVar;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar3);
            } else {
                btsVar3.r0();
            }
            qje.W(fidVar, d.f, a);
            qje.W(fidVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar3, hashCode, wlsVar);
            }
            qje.W(fidVar, d.d, d);
            f530 c = ljs0.c(c530Var, 1.0f);
            qnm qnmVar = qnm.a;
            qnm.d.getClass();
            com.yandex.messaging.ui.neophonish.b.f(0, fidVar, slsVar, an91.o(c, 16.0f, 0.0f, 16.0f, 2.0f, 2));
            crm crmVar = new crm(ohb1.e(fidVar, oyh0.fake_attaches_gallery), null, 14, 1);
            mgv mgvVar = y4b1.a;
            if (mgvVar == null) {
                lgv lgvVar = new lgv("ImageOutlineMdRegular", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e = nnm.e(12.0f, 9.5f);
                e.d(12.0f, 10.881f, 10.881f, 12.0f, 9.5f, 12.0f);
                e.d(8.119f, 12.0f, 7.0f, 10.881f, 7.0f, 9.5f);
                e.d(7.0f, 8.119f, 8.119f, 7.0f, 9.5f, 7.0f);
                e.d(10.881f, 7.0f, 12.0f, 8.119f, 12.0f, 9.5f);
                e.c();
                e.j(10.5f, 9.5f);
                e.d(10.5f, 10.052f, 10.052f, 10.5f, 9.5f, 10.5f);
                e.d(8.948f, 10.5f, 8.5f, 10.052f, 8.5f, 9.5f);
                e.d(8.5f, 8.948f, 8.948f, 8.5f, 9.5f, 8.5f);
                e.d(10.052f, 8.5f, 10.5f, 8.948f, 10.5f, 9.5f);
                e.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                a6t0 a6t0Var2 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e2 = nnm.e(3.304f, 5.469f);
                e2.d(3.0f, 6.204f, 3.0f, 7.136f, 3.0f, 9.0f);
                e2.o(15.0f);
                e2.d(3.0f, 16.864f, 3.0f, 17.796f, 3.304f, 18.531f);
                e2.d(3.71f, 19.511f, 4.489f, 20.289f, 5.469f, 20.695f);
                e2.d(6.204f, 21.0f, 7.136f, 21.0f, 9.0f, 21.0f);
                e2.f(15.0f);
                e2.d(16.864f, 21.0f, 17.796f, 21.0f, 18.531f, 20.695f);
                e2.d(19.511f, 20.289f, 20.289f, 19.511f, 20.695f, 18.531f);
                e2.d(21.0f, 17.796f, 21.0f, 16.864f, 21.0f, 15.0f);
                e2.o(9.0f);
                e2.d(21.0f, 7.136f, 21.0f, 6.204f, 20.695f, 5.469f);
                e2.d(20.289f, 4.489f, 19.511f, 3.71f, 18.531f, 3.304f);
                e2.d(17.796f, 3.0f, 16.864f, 3.0f, 15.0f, 3.0f);
                e2.f(9.0f);
                e2.d(7.136f, 3.0f, 6.204f, 3.0f, 5.469f, 3.304f);
                e2.d(4.489f, 3.71f, 3.71f, 4.489f, 3.304f, 5.469f);
                e2.c();
                e2.j(15.0f, 4.5f);
                e2.f(9.0f);
                e2.d(8.048f, 4.5f, 7.408f, 4.501f, 6.913f, 4.535f);
                e2.d(6.432f, 4.567f, 6.198f, 4.626f, 6.043f, 4.69f);
                e2.d(5.431f, 4.944f, 4.944f, 5.431f, 4.69f, 6.043f);
                e2.d(4.626f, 6.198f, 4.567f, 6.432f, 4.535f, 6.913f);
                e2.d(4.501f, 7.408f, 4.5f, 8.048f, 4.5f, 9.0f);
                e2.o(15.0f);
                e2.d(4.5f, 15.877f, 4.501f, 16.488f, 4.527f, 16.966f);
                e2.h(7.317f, 14.689f);
                e2.h(11.335f, 15.69f);
                e2.h(15.37f, 12.656f);
                e2.h(19.5f, 14.158f);
                e2.o(9.0f);
                e2.d(19.5f, 8.048f, 19.499f, 7.408f, 19.465f, 6.913f);
                e2.d(19.433f, 6.432f, 19.374f, 6.198f, 19.31f, 6.043f);
                e2.d(19.056f, 5.431f, 18.569f, 4.944f, 17.957f, 4.69f);
                e2.d(17.802f, 4.626f, 17.568f, 4.567f, 17.087f, 4.535f);
                e2.d(16.592f, 4.501f, 15.952f, 4.5f, 15.0f, 4.5f);
                e2.c();
                e2.j(6.043f, 19.31f);
                e2.d(5.63f, 19.138f, 5.274f, 18.861f, 5.008f, 18.51f);
                e2.h(7.683f, 16.326f);
                e2.h(11.665f, 17.318f);
                e2.h(15.622f, 14.344f);
                e2.h(19.499f, 15.753f);
                e2.d(19.497f, 16.311f, 19.489f, 16.735f, 19.465f, 17.087f);
                e2.d(19.433f, 17.568f, 19.374f, 17.802f, 19.31f, 17.957f);
                e2.d(19.056f, 18.569f, 18.569f, 19.056f, 17.957f, 19.31f);
                e2.d(17.802f, 19.374f, 17.568f, 19.433f, 17.087f, 19.465f);
                e2.d(16.592f, 19.499f, 15.952f, 19.5f, 15.0f, 19.5f);
                e2.f(9.0f);
                e2.d(8.048f, 19.5f, 7.408f, 19.499f, 6.913f, 19.465f);
                e2.d(6.432f, 19.433f, 6.198f, 19.374f, 6.043f, 19.31f);
                e2.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", e2.a);
                mgvVar = lgvVar.d();
                y4b1.a = mgvVar;
            }
            tqm h = bei.h(mgvVar, null, fidVar, 6);
            oqm oqmVar = oqm.a;
            mrm.d(crmVar, h, null, oqmVar, false, null, null, null, null, null, fidVar, 27648, 0, 4068);
            crm crmVar2 = new crm(ohb1.e(fidVar, oyh0.fake_attaches_files), null, 14, 1);
            mgv mgvVar2 = xj91.a;
            if (mgvVar2 == null) {
                lgv lgvVar2 = new lgv("DocEmptyOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var3 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e3 = nnm.e(11.184f, 2.0f);
                e3.d(12.325f, 2.0f, 12.896f, 2.0f, 13.429f, 2.15f);
                e3.d(13.731f, 2.236f, 14.023f, 2.356f, 14.298f, 2.51f);
                e3.d(14.781f, 2.78f, 15.184f, 3.184f, 15.991f, 3.991f);
                e3.h(18.009f, 6.009f);
                e3.d(18.816f, 6.816f, 19.22f, 7.22f, 19.49f, 7.702f);
                e3.d(19.644f, 7.977f, 19.764f, 8.269f, 19.85f, 8.571f);
                e3.d(20.0f, 9.104f, 20.0f, 9.675f, 20.0f, 10.816f);
                e3.o(15.2f);
                e3.d(20.0f, 17.819f, 20.0f, 19.128f, 19.41f, 20.09f);
                e3.d(19.08f, 20.628f, 18.628f, 21.08f, 18.09f, 21.41f);
                e3.d(17.128f, 22.0f, 15.819f, 22.0f, 13.2f, 22.0f);
                e3.f(10.8f);
                e3.d(8.181f, 22.0f, 6.872f, 22.0f, 5.91f, 21.41f);
                e3.d(5.372f, 21.08f, 4.92f, 20.628f, 4.59f, 20.09f);
                e3.d(4.0f, 19.128f, 4.0f, 17.819f, 4.0f, 15.2f);
                e3.o(8.8f);
                e3.d(4.0f, 6.181f, 4.0f, 4.872f, 4.59f, 3.91f);
                e3.d(4.92f, 3.372f, 5.372f, 2.92f, 5.91f, 2.59f);
                e3.d(6.769f, 2.064f, 7.904f, 2.007f, 10.0f, 2.001f);
                e3.h(10.032f, 2.0f);
                e3.f(11.184f);
                e3.c();
                e3.j(10.293f, 4.0f);
                e3.d(9.227f, 4.001f, 8.495f, 4.01f, 7.923f, 4.064f);
                e3.d(7.294f, 4.124f, 7.069f, 4.225f, 6.955f, 4.295f);
                e3.d(6.686f, 4.46f, 6.46f, 4.686f, 6.295f, 4.955f);
                e3.d(6.225f, 5.069f, 6.124f, 5.294f, 6.064f, 5.923f);
                e3.d(6.002f, 6.581f, 6.0f, 7.452f, 6.0f, 8.8f);
                e3.o(15.2f);
                e3.d(6.0f, 16.548f, 6.002f, 17.419f, 6.064f, 18.077f);
                e3.d(6.124f, 18.706f, 6.225f, 18.931f, 6.295f, 19.045f);
                e3.d(6.46f, 19.314f, 6.686f, 19.54f, 6.955f, 19.705f);
                e3.d(7.069f, 19.775f, 7.294f, 19.876f, 7.923f, 19.935f);
                e3.d(8.581f, 19.998f, 9.452f, 20.0f, 10.8f, 20.0f);
                e3.f(13.2f);
                e3.d(14.548f, 20.0f, 15.419f, 19.998f, 16.077f, 19.935f);
                e3.d(16.706f, 19.876f, 16.931f, 19.775f, 17.045f, 19.705f);
                e3.d(17.314f, 19.54f, 17.54f, 19.314f, 17.705f, 19.045f);
                e3.d(17.775f, 18.931f, 17.876f, 18.706f, 17.935f, 18.077f);
                e3.d(17.998f, 17.419f, 18.0f, 16.548f, 18.0f, 15.2f);
                e3.o(12.0f);
                e3.d(18.0f, 11.52f, 18.0f, 11.211f, 17.983f, 10.974f);
                e3.d(17.968f, 10.746f, 17.941f, 10.659f, 17.924f, 10.617f);
                e3.d(17.822f, 10.372f, 17.628f, 10.178f, 17.383f, 10.076f);
                e3.d(17.341f, 10.059f, 17.254f, 10.032f, 17.026f, 10.017f);
                e3.d(16.789f, 10.0f, 16.48f, 10.0f, 16.0f, 10.0f);
                e3.f(15.968f);
                e3.d(15.529f, 10.0f, 15.151f, 10.0f, 14.838f, 9.979f);
                e3.d(14.508f, 9.956f, 14.177f, 9.906f, 13.852f, 9.771f);
                e3.d(13.117f, 9.467f, 12.533f, 8.883f, 12.229f, 8.148f);
                e3.d(12.094f, 7.823f, 12.044f, 7.492f, 12.021f, 7.162f);
                e3.d(12.0f, 6.849f, 12.0f, 6.471f, 12.0f, 6.032f);
                e3.o(6.0f);
                e3.d(12.0f, 5.52f, 12.0f, 5.211f, 11.983f, 4.974f);
                e3.d(11.968f, 4.746f, 11.941f, 4.659f, 11.924f, 4.617f);
                e3.d(11.822f, 4.372f, 11.628f, 4.178f, 11.383f, 4.076f);
                e3.d(11.341f, 4.059f, 11.254f, 4.032f, 11.026f, 4.017f);
                e3.d(10.842f, 4.004f, 10.612f, 4.001f, 10.293f, 4.0f);
                e3.c();
                e3.j(13.979f, 4.838f);
                e3.d(14.0f, 5.151f, 14.0f, 5.529f, 14.0f, 5.968f);
                e3.o(6.0f);
                e3.d(14.0f, 6.48f, 14.0f, 6.789f, 14.017f, 7.026f);
                e3.d(14.032f, 7.254f, 14.059f, 7.341f, 14.076f, 7.383f);
                e3.d(14.178f, 7.628f, 14.372f, 7.822f, 14.617f, 7.924f);
                e3.d(14.659f, 7.941f, 14.746f, 7.968f, 14.974f, 7.983f);
                e3.d(15.211f, 8.0f, 15.52f, 8.0f, 16.0f, 8.0f);
                e3.f(16.032f);
                e3.d(16.471f, 8.0f, 16.849f, 8.0f, 17.162f, 8.021f);
                e3.d(17.171f, 8.022f, 17.18f, 8.023f, 17.188f, 8.023f);
                e3.d(17.039f, 7.869f, 16.845f, 7.674f, 16.594f, 7.423f);
                e3.h(14.577f, 5.406f);
                e3.d(14.326f, 5.155f, 14.131f, 4.961f, 13.977f, 4.812f);
                e3.d(13.977f, 4.82f, 13.978f, 4.829f, 13.979f, 4.838f);
                e3.c();
                lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var3, null, "", e3.a);
                mgvVar2 = lgvVar2.d();
                xj91.a = mgvVar2;
            }
            mrm.d(crmVar2, bei.h(mgvVar2, null, fidVar, 6), null, oqmVar, false, null, null, null, null, null, fidVar, 27648, 0, 4068);
            crm crmVar3 = new crm(ohb1.e(fidVar, oyh0.messenger_create_poll_button_title), new ldc(qnm.c(fidVar).g0()), 6, 1);
            mgv mgvVar3 = lkb1.a;
            if (mgvVar3 == null) {
                lgv lgvVar3 = new lgv("ChartBoxOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var4 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e4 = nnm.e(12.552f, 2.0f);
                e4.d(14.145f, 2.0f, 15.412f, 2.0f, 16.428f, 2.097f);
                e4.d(17.469f, 2.196f, 18.35f, 2.403f, 19.135f, 2.884f);
                e4.d(19.942f, 3.379f, 20.622f, 4.058f, 21.116f, 4.865f);
                e4.d(21.597f, 5.65f, 21.804f, 6.531f, 21.903f, 7.572f);
                e4.d(22.0f, 8.588f, 22.0f, 9.855f, 22.0f, 11.448f);
                e4.o(12.552f);
                e4.d(22.0f, 14.145f, 22.0f, 15.412f, 21.903f, 16.428f);
                e4.d(21.804f, 17.469f, 21.597f, 18.35f, 21.116f, 19.135f);
                e4.d(20.622f, 19.942f, 19.942f, 20.622f, 19.135f, 21.116f);
                e4.d(18.35f, 21.597f, 17.469f, 21.804f, 16.428f, 21.903f);
                e4.d(15.412f, 22.0f, 14.145f, 22.0f, 12.552f, 22.0f);
                e4.f(11.448f);
                e4.d(9.855f, 22.0f, 8.588f, 22.0f, 7.572f, 21.903f);
                e4.d(6.531f, 21.804f, 5.65f, 21.597f, 4.865f, 21.116f);
                e4.d(4.058f, 20.622f, 3.379f, 19.942f, 2.884f, 19.135f);
                e4.d(2.403f, 18.35f, 2.196f, 17.469f, 2.097f, 16.428f);
                e4.d(2.0f, 15.412f, 2.0f, 14.145f, 2.0f, 12.552f);
                e4.o(11.448f);
                e4.d(2.0f, 9.855f, 2.0f, 8.588f, 2.097f, 7.572f);
                e4.d(2.196f, 6.531f, 2.403f, 5.65f, 2.884f, 4.865f);
                e4.d(3.379f, 4.058f, 4.058f, 3.379f, 4.865f, 2.884f);
                e4.d(5.65f, 2.403f, 6.531f, 2.196f, 7.572f, 2.097f);
                e4.d(8.588f, 2.0f, 9.855f, 2.0f, 11.448f, 2.0f);
                e4.f(12.552f);
                e4.c();
                e4.j(10.0f, 19.996f);
                e4.d(10.452f, 19.999f, 10.949f, 20.0f, 11.5f, 20.0f);
                e4.f(12.5f);
                e4.d(13.051f, 20.0f, 13.548f, 19.999f, 14.0f, 19.996f);
                e4.o(10.0f);
                e4.f(10.0f);
                e4.o(19.996f);
                e4.c();
                e4.j(4.02f, 15.0f);
                e4.d(4.032f, 15.465f, 4.053f, 15.873f, 4.088f, 16.238f);
                e4.d(4.173f, 17.134f, 4.334f, 17.672f, 4.59f, 18.09f);
                e4.d(4.92f, 18.628f, 5.372f, 19.08f, 5.91f, 19.41f);
                e4.d(6.328f, 19.666f, 6.866f, 19.827f, 7.762f, 19.912f);
                e4.d(7.839f, 19.92f, 7.919f, 19.926f, 8.0f, 19.933f);
                e4.o(15.0f);
                e4.f(4.02f);
                e4.c();
                e4.j(16.0f, 19.933f);
                e4.d(16.081f, 19.926f, 16.161f, 19.92f, 16.238f, 19.912f);
                e4.d(17.134f, 19.827f, 17.672f, 19.666f, 18.09f, 19.41f);
                e4.d(18.628f, 19.08f, 19.08f, 18.628f, 19.41f, 18.09f);
                e4.d(19.666f, 17.672f, 19.827f, 17.134f, 19.912f, 16.238f);
                e4.d(19.99f, 15.422f, 19.999f, 14.396f, 20.0f, 13.0f);
                e4.f(16.0f);
                e4.o(19.933f);
                e4.c();
                e4.j(11.5f, 4.0f);
                e4.d(9.844f, 4.0f, 8.672f, 4.001f, 7.762f, 4.088f);
                e4.d(6.866f, 4.173f, 6.328f, 4.334f, 5.91f, 4.59f);
                e4.d(5.372f, 4.92f, 4.92f, 5.372f, 4.59f, 5.91f);
                e4.d(4.334f, 6.328f, 4.173f, 6.866f, 4.088f, 7.762f);
                e4.d(4.001f, 8.672f, 4.0f, 9.844f, 4.0f, 11.5f);
                e4.o(13.0f);
                e4.f(8.0f);
                e4.o(8.0f);
                e4.f(16.0f);
                e4.o(11.0f);
                e4.f(20.0f);
                e4.d(19.999f, 9.604f, 19.99f, 8.578f, 19.912f, 7.762f);
                e4.d(19.827f, 6.866f, 19.666f, 6.328f, 19.41f, 5.91f);
                e4.d(19.08f, 5.372f, 18.628f, 4.92f, 18.09f, 4.59f);
                e4.d(17.672f, 4.334f, 17.134f, 4.173f, 16.238f, 4.088f);
                e4.d(15.328f, 4.001f, 14.156f, 4.0f, 12.5f, 4.0f);
                e4.f(11.5f);
                e4.c();
                lgvVar3.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var4, null, "", e4.a);
                mgvVar3 = lgvVar3.d();
                lkb1.a = mgvVar3;
            }
            mrm.d(crmVar3, bei.h(mgvVar3, new ldc(qnm.c(fidVar).g0()), fidVar, 2), null, oqmVar, false, null, null, null, null, slsVar2, fidVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 2036);
            btsVar3.t(true);
        }
        return zy11.a;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        int i6 = 0;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i5) {
            case 0:
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar).k(u4yVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    tq4 tq4Var = (tq4) ((List) obj6).get(intValue);
                    btsVar.e0(-203152735);
                    web1.c(ljs0.c(c530Var, 1.0f), 0.0f, false, 0.0f, null, null, wwg.S(2110484258, true, new vs4(i6, tq4Var), btsVar), null, null, null, null, null, false, btsVar, 1572870, 0, 8126);
                    if (intValue != scc.f((List) obj5)) {
                        btsVar.e0(-202814464);
                        dk91.a(0.0f, 6, 6, 0L, btsVar, an91.m(c530Var, 16.0f, 0.0f, 2));
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-202718364);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                bms bmsVar = (bms) obj5;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((bts) fidVar2).k(u4yVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= fidVar2.c(intValue3) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    jus0 jus0Var = (jus0) ((List) obj6).get(intValue3);
                    btsVar2.e0(-303967478);
                    boolean k = btsVar2.k(bmsVar) | btsVar2.k(jus0Var);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new z5(10, bmsVar, jus0Var);
                        btsVar2.o0(Q);
                    }
                    az91.b(jus0Var, (sls) Q, btsVar2, 0);
                    dk91.a(0.0f, 6, 6, 0L, btsVar2, an91.o(c530.a, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar2.t(false);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                u4y u4yVar3 = (u4y) obj;
                int intValue5 = ((Number) obj2).intValue();
                fid fidVar3 = (fid) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((bts) fidVar3).k(u4yVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= fidVar3.c(intValue5) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i3 & 1, (i3 & 147) != 146)) {
                    m5f m5fVar = (m5f) ((List) obj6).get(intValue5);
                    btsVar3.e0(-1266638109);
                    msa1.f(m5fVar, (pa90) obj5, null, btsVar3, 0);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                u4y u4yVar4 = (u4y) obj;
                int intValue7 = ((Number) obj2).intValue();
                fid fidVar4 = (fid) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((bts) fidVar4).k(u4yVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= fidVar4.c(intValue7) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i4 & 1, (i4 & 147) != 146)) {
                    oyy0 oyy0Var = (oyy0) ((List) obj6).get(intValue7);
                    btsVar4.e0(146681139);
                    if (oyy0Var instanceof lyy0) {
                        btsVar4.e0(-1657834885);
                        lyy0 lyy0Var = (lyy0) oyy0Var;
                        Object Q2 = btsVar4.Q();
                        if (Q2 == did.a) {
                            Q2 = vom.G;
                            btsVar4.o0(Q2);
                        }
                        cpb1.a(lyy0Var, (wls) Q2, null, false, btsVar4, 48);
                        btsVar4.t(false);
                    } else if (jl40.l(oyy0Var, myy0.a)) {
                        btsVar4.e0(-1657830108);
                        cpb1.d(null, btsVar4, 0);
                        btsVar4.t(false);
                    } else {
                        if (!(oyy0Var instanceof nyy0)) {
                            throw unr0.y(-1657836458, btsVar4, false);
                        }
                        btsVar4.e0(-1657827794);
                        cpb1.b((nyy0) oyy0Var, null, false, btsVar4, 8);
                        btsVar4.t(false);
                    }
                    if (intValue7 != scc.f(((u540) obj5).a.b)) {
                        btsVar4.e0(147062655);
                        yrl.e(null, null, btsVar4, 0, 7);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(147118393);
                        btsVar4.t(false);
                    }
                    btsVar4.t(false);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                j690 j690Var = (j690) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue9 = ((Number) obj4).intValue();
                if ((intValue9 & 48) == 0) {
                    intValue9 |= ((bts) fidVar5).k(j690Var) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue9 & 1, (intValue9 & 145) != 144)) {
                    f530 n = an91.n(an91.j(ljs0.c(c530Var, 1.0f), j690Var), 16.0f, 16.0f, 16.0f, 8.0f);
                    ci40 ci40Var = (ci40) obj6;
                    tls tlsVar = (tls) obj5;
                    sic a = qic.a(g43Var, x4c.G, btsVar5, 54);
                    int hashCode = Long.hashCode(btsVar5.T);
                    r1b0 o = btsVar5.o();
                    f530 d = b.d(btsVar5, n);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, a);
                    qje.W(btsVar5, d.e, o);
                    qje.W(btsVar5, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar5, d.h);
                    qje.W(btsVar5, d.d, d);
                    vpb1.k(ci40Var.a, btsVar5, 0);
                    oeb1.c(btsVar5, ljs0.e(c530Var, 16.0f));
                    vpb1.j(0, btsVar5, tlsVar, ci40Var.c, ci40Var.b);
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                j690 j690Var2 = (j690) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 48) == 0) {
                    intValue10 |= ((bts) fidVar6).k(j690Var2) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue10 & 1, (intValue10 & 145) != 144)) {
                    f530 n2 = an91.n(an91.j(ljs0.c(c530Var, 1.0f), j690Var2), 16.0f, 16.5f, 16.0f, 8.0f);
                    si40 si40Var = (si40) obj6;
                    tls tlsVar2 = (tls) obj5;
                    sic a2 = qic.a(g43Var, x4c.G, btsVar6, 54);
                    int hashCode2 = Long.hashCode(btsVar6.T);
                    r1b0 o2 = btsVar6.o();
                    f530 d2 = b.d(btsVar6, n2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar2);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a2);
                    qje.W(btsVar6, d.e, o2);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d2);
                    wpb1.e(si40Var.a, btsVar6, 0);
                    oeb1.c(btsVar6, ljs0.e(c530Var, 16.0f));
                    wpb1.g(si40Var.b, si40Var.c, tlsVar2, btsVar6, 0);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                return b(obj, obj2, obj3, obj4);
            case 7:
                fid fidVar7 = (fid) obj3;
                int intValue11 = ((Number) obj4).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue11 & 1, (intValue11 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    hsm0 hsm0Var = (hsm0) obj6;
                    tls tlsVar3 = (tls) obj5;
                    sic a3 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int hashCode3 = Long.hashCode(btsVar7.T);
                    r1b0 o3 = btsVar7.o();
                    f530 d3 = b.d(btsVar7, c530Var);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar3);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a3);
                    qje.W(btsVar7, d.e, o3);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d3);
                    f0b1.e(hsm0Var.a, btsVar7, 0);
                    f0b1.c(hsm0Var.b, btsVar7, 0);
                    f0b1.a(hsm0Var, tlsVar3, btsVar7, 0);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                fid fidVar8 = (fid) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 48) == 0) {
                    intValue12 |= fidVar8.a(booleanValue) ? 32 : 16;
                }
                if ((intValue12 & 145) == 144) {
                    bts btsVar8 = (bts) fidVar8;
                    if (btsVar8.E()) {
                        btsVar8.Y();
                        return zy11Var;
                    }
                }
                if (!booleanValue) {
                    qnm.d.getClass();
                    ((SelectFolderDialogFragment) obj6).SelectFolderDialogContent(an91.o(c530.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, (sls) obj5, fidVar8, 0, 2);
                }
                return zy11Var;
        }
    }
}
