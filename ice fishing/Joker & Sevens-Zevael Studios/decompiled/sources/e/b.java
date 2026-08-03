package e;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.LinkedHashMap;
import java.util.UUID;
import m0.e0;
import m0.t;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1896g;

    public /* synthetic */ b(int i10) {
        this.f1896g = i10;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f1896g) {
            case 0:
                return UUID.randomUUID().toString();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                e0 e0Var = i.f1912a;
                return null;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                e0 e0Var2 = j.f1913a;
                return null;
            case 3:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 4:
                return Integer.valueOf(sc.e.f6476h.d().nextInt(2147418112) + 65536);
            case 5:
                byte[] bArr = ce.a.f1400a;
                return new kd.a(x4.f.I(bArr, "56dnm83b_74oWgwghPVQ0xxd3H4EGlaJY4Z9C_Mu-A4="), x4.f.I(bArr, "RM-hc6bJRLPmFSgD3zalA3uvfKeevg2KwLods-4MQTs="), x4.f.I(bArr, "LC-fPNefQf9v5GKBMGq1InrAPg44jFvH65QuRR4FlNI="), x4.f.I(bArr, "UblBpNHQCW93tZBn_MwBByljREGQOmkv4kjMaW_gZCY="));
            case 6:
                return x4.f.I(ce.a.f1400a, "BMA2MDTIWDIPwX81Z_sYNykk5gZclI6lnjgv6FkTNT-awJHWyy0PRs7AYY3KOxip");
            case 7:
                return x4.f.I(ce.a.f1400a, "wS04f2k9oT2U6FaOV3jmUr9T6e0V198Xb7mZrUEN5kilMppDPoO16BOFdWQ2_3g_xvP0V0DmWLs5v2szto-T5g==");
            case 8:
                return x4.f.I(ce.a.f1400a, "yQiW18WoqSjAph93f7xxaLoX0-Zkpy_XxS4zXWDqXzw=");
            case 9:
                return x4.f.I(ce.a.f1400a, "f3RPLbIz-pBBIc27OjZewTkROWgXDi21jwj3kZ4aNSw=");
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                byte[] bArr2 = ce.a.f1400a;
                return new ac.i(x4.f.I(bArr2, "-ScnG_ZN_jCk5OqDAfSMgR9BX_kip27GkBgmp7Ec-iE="), x4.f.I(bArr2, "Lu0nWUZUDD3ytfs89wXugvf_3j4GP8i9C3Hhq_2VLbIq5oFE5fke2W2t8i9mjw6ulbLYbka0nGsa5Fej1lvgPQ=="));
            case 11:
                return x4.f.I(ce.a.f1400a, "a24wJiPbg7tSdkxSbas9-3OHCRfl_ROx3rSeOsgZKNc=");
            case 12:
                t.d("Unexpected call to default provider");
                throw new ac.d();
            case 13:
                return new v0.d(new LinkedHashMap());
            case 14:
                x2 x2Var = v0.g.f7043a;
                return null;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                x2 x2Var2 = x0.c.f7964a;
                return null;
            case 17:
                x2 x2Var3 = x0.e.f7966a;
                return null;
            default:
                e0 e0Var3 = y3.a.f8732a;
                return null;
        }
    }
}
