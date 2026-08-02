package defpackage;

import android.graphics.SurfaceTexture;
import android.os.IBinder;
import android.os.IInterface;
import android.view.Surface;
import androidx.fragment.app.m;
import com.samsung.android.sdk.samsungpay.v2.card.ISCardManager;
import com.samsung.android.sdk.samsungpay.v2.f;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeViewState$InputStep;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public final /* synthetic */ class vm7 implements ims, rxe0, f18, t18, ev31, f.d, qur, a9f, fp60 {
    public final /* synthetic */ int a;

    public /* synthetic */ vm7(int i) {
        this.a = i;
    }

    private final void c() {
    }

    private final void d() {
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // defpackage.rxe0
    public void a(znw0 znw0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(znw0Var.b.getWidth(), znw0Var.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        znw0Var.b(surface, geb1.b(), new ot7(0, surface, surfaceTexture));
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
            case 4:
            case 5:
            default:
                return Integer.valueOf(((w9x0) obj).a);
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                return Boolean.FALSE;
            case 6:
                return new j5f0((i5f0) obj);
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.f.d
    public IInterface b(IBinder iBinder) {
        return ISCardManager.Stub.asInterface(iBinder);
    }

    @Override // defpackage.f18
    public void cancel() {
        int i = this.a;
    }

    @Override // defpackage.fp60
    public Object i() {
        switch (this.a) {
            case 24:
                return new ArrayList();
            case 25:
                return new ConcurrentHashMap();
            case 26:
                return new ConcurrentSkipListMap();
            case 27:
                return new LinkedHashSet();
            case 28:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // defpackage.qur
    public void k(ArrayList arrayList) {
    }

    @Override // defpackage.a9f
    public Object l(m mVar) {
        switch (this.a) {
            case 20:
                return new InfoFragment();
            case 21:
                return new LogsFragment();
            default:
                return new ReportFormFragment();
        }
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        switch (this.a) {
            case 13:
                sh8 sh8Var = (sh8) obj;
                w9a1 w9a1Var = sh8Var.b;
                return w9a1Var instanceof t7o ? xh8.b : w9a1Var instanceof u7o ? xh8.e : w9a1Var instanceof s7o ? xh8.a : sh8Var.a ? xh8.c : xh8.d;
            case 14:
            case 16:
            default:
                e39 e39Var = (e39) obj;
                Text text = e39Var.b;
                b bVar = Text.Companion;
                MoneyEntity moneyEntity = e39Var.c;
                String formattedAmount = moneyEntity != null ? moneyEntity.getFormattedAmount() : null;
                if (formattedAmount == null) {
                    formattedAmount = "";
                }
                Text.Constant i = g8e.i(bVar, formattedAmount);
                Text text2 = e39Var.d;
                List list = e39Var.e;
                a5b1 a5b1Var = e39Var.f;
                kao a = a5b1Var instanceof xep0 ? r501.a(((xep0) a5b1Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : null;
                o39 o39Var = e39Var.a;
                return new h39(text, o39Var != null ? o39Var.c : null, i, text2, a, list, e39Var.f);
            case 15:
                sl8 sl8Var = (sl8) obj;
                if (sl8Var instanceof ql8) {
                    return xl8.b;
                }
                if (sl8Var.equals(nl8.c)) {
                    return xl8.c;
                }
                if (sl8Var.equals(nl8.b)) {
                    return xl8.a;
                }
                if (sl8Var.equals(nl8.d)) {
                    return xl8.d;
                }
                if (sl8Var instanceof ol8) {
                    return new wl8(((ol8) sl8Var).b.length(), CardPinCodeViewState$InputStep.FIRST);
                }
                if (sl8Var instanceof pl8) {
                    return new wl8(((pl8) sl8Var).b.length(), CardPinCodeViewState$InputStep.FIRST);
                }
                if (sl8Var instanceof rl8) {
                    return new wl8(((rl8) sl8Var).c.length(), CardPinCodeViewState$InputStep.SECOND);
                }
                w511.b();
                return null;
            case 17:
                m29 m29Var = (m29) obj;
                int i2 = m29Var.d - m29Var.e;
                kao kaoVar = m29Var.f;
                if (kaoVar != null) {
                    return new q29(kaoVar);
                }
                if (m29Var.g) {
                    return r29.a;
                }
                ListBuilder a2 = rcc.a();
                a2.add(new acq0(m29Var.a, i2 == 0 ? unr0.h(Text.Companion, dzh0.ybsdk_cashback_all_categories_was_selected) : new Text.Plural(gwh0.ybsdk_cashback_select_categories_description_plurals, i2)));
                a2.addAll(m29Var.c);
                return new p29(a2.j(), unr0.h(Text.Companion, dzh0.ybsdk_cashback_submit_button_text), m29Var.h);
        }
    }

    public /* synthetic */ vm7(qa60 qa60Var, int i) {
        this.a = i;
    }
}
