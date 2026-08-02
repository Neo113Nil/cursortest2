package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.alicekit.core.widget.TabView;
import com.yandex.delivery.libs.imageupload.impl.data.UploadImageTypeDto;
import com.yandex.go.tips.ui.selector_v1.TipsSelectorModalView;
import com.yandex.messaging.internal.authorized.sync.SyncSource;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.ActionTools;
import ru.CryptoPro.JCP.tools.SelfTesterException;
import ru.CryptoPro.JCP.tools.Starter;
import ru.yandex.taxi.stories.presentation.story.StoryTopView;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class s2u0 implements ActionTools.Action, ypu0, tji0, xs21, g5x0, n4y0, kfy0, gpy0, ugz0, ev31, vls, Supplier, zbv, zme, ax60, jw31 {
    public final /* synthetic */ int a;

    public /* synthetic */ s2u0(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d(int i, Object obj, Object obj2, Object obj3, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append(obj3);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, String str, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new SelfTesterException(th);
    }

    @Override // defpackage.kfy0
    public xel a(bg90 bg90Var, JSONObject jSONObject) {
        return ((fxk) ft6.b.Y9.getValue()).a(bg90Var, jSONObject);
    }

    @Override // defpackage.vls, defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return Integer.valueOf(((xzz0) obj).c);
    }

    @Override // defpackage.ypu0
    public void b() {
        StoryTopView.EMPTY_LISTENER$lambda$0();
    }

    @Override // defpackage.tji0
    public int c(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // defpackage.xs21
    public e1k e(cl21 cl21Var) {
        return ((d9g) cl21Var).f().c(true, true, SyncSource.Sync);
    }

    @Override // ru.CryptoPro.JCP.tools.ActionTools.Action
    public Object execute() {
        Void lambda$new$0;
        Void lambda$new$02;
        Void lambda$new$03;
        switch (this.a) {
            case 0:
                lambda$new$0 = Starter.lambda$new$0();
                return lambda$new$0;
            case 1:
                lambda$new$02 = ru.CryptoPro.JCSP.Starter.lambda$new$0();
                return lambda$new$02;
            default:
                lambda$new$03 = ru.CryptoPro.Crypto.Starter.lambda$new$0();
                return lambda$new$03;
        }
    }

    @Override // defpackage.zbv
    public rbv g(Context context, int i, int i2) {
        return new nbv(txg0.ybsdk_ic_yb_placeholder, null);
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get */
    public Object getValue() {
        SurfaceSize _get_surfaceSizeSupplier_$lambda$0;
        StartQuality _get_startQualitySupplier_$lambda$1;
        switch (this.a) {
            case 18:
                _get_surfaceSizeSupplier_$lambda$0 = TrackSelectionRestrictionsProvider._get_surfaceSizeSupplier_$lambda$0();
                return _get_surfaceSizeSupplier_$lambda$0;
            default:
                _get_startQualitySupplier_$lambda$1 = TrackSelectionRestrictionsProvider._get_startQualitySupplier_$lambda$1();
                return _get_startQualitySupplier_$lambda$1;
        }
    }

    @Override // defpackage.g5x0
    public int getMaxWidth() {
        int lambda$new$0;
        lambda$new$0 = TabView.lambda$new$0();
        return lambda$new$0;
    }

    @Override // defpackage.n4y0
    public void h() {
    }

    @Override // defpackage.jw31
    public boolean i(View view) {
        return view.hasFocus();
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        return ((UploadImageTypeDto) obj).getValue();
    }

    @Override // defpackage.ax60
    public void m(View view, n751 n751Var, bv31 bv31Var) {
        switch (this.a) {
            case 26:
                ni91.o(0, bv31Var.b.d + n751Var.a.g(527).d, 1, view);
                break;
            case 27:
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), bv31Var.a.d + n751Var.a.g(527).d);
                break;
            default:
                ni91.o(bv31Var.b.b + n751Var.a.g(527).b, 0, 2, view);
                break;
        }
    }

    @Override // defpackage.ugz0
    public void n(String str) {
        TipsSelectorModalView.tipUpdateListener$lambda$0(str);
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        u8j0 u8j0Var = (u8j0) obj;
        switch (this.a) {
            case 15:
                return zka1.d(u8j0Var, new f0z0(21));
            case 16:
                return u8j0Var;
            default:
                return zka1.d(u8j0Var, new ri01(19));
        }
    }
}
