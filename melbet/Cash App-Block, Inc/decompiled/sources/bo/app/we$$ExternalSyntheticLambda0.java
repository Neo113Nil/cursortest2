package bo.app;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidInstructionsBinding;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final /* synthetic */ class we$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ double f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ we$$ExternalSyntheticLambda0(GovernmentIdInstructionsRunner governmentIdInstructionsRunner, double d) {
        this.$r8$classId = 2;
        this.f$1 = governmentIdInstructionsRunner;
        this.f$0 = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.$r8$classId;
        double d = this.f$0;
        Object obj = this.f$1;
        switch (i2) {
            case 0:
                return we.a(d, (we) obj);
            case 1:
                Context context = (Context) obj;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    i = (context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    i = 256;
                }
                return Long.valueOf((long) (d * i * 1048576));
            default:
                Pi2GovernmentidInstructionsBinding pi2GovernmentidInstructionsBinding = ((GovernmentIdInstructionsRunner) obj).binding;
                View view = pi2GovernmentidInstructionsBinding.listDivider;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (d > 0.0d) {
                    layoutParams.height = (int) ExtensionsKt.getDpToPx(d);
                } else {
                    pi2GovernmentidInstructionsBinding.listDivider.setVisibility(8);
                }
                view.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ we$$ExternalSyntheticLambda0(double d, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = d;
        this.f$1 = obj;
    }
}
