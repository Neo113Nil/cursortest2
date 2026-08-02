package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.InputFieldType;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class wue implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ CorpCreatingDraftModalView b;

    public /* synthetic */ wue(CorpCreatingDraftModalView corpCreatingDraftModalView, int i) {
        this.a = i;
        this.b = corpCreatingDraftModalView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ej6 ej6Var;
        d4f d4fVar;
        ej6 ej6Var2;
        d4f d4fVar2;
        ej6 ej6Var3;
        d4f d4fVar3;
        ej6 ej6Var4;
        d4f d4fVar4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        CorpCreatingDraftModalView corpCreatingDraftModalView = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ej6Var = corpCreatingDraftModalView.branchedAnalytics;
                    d4fVar = corpCreatingDraftModalView.pageInfo;
                    ej6Var.b(d4fVar.h, InputFieldType.COMPANY_NAME);
                    break;
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    ej6Var2 = corpCreatingDraftModalView.branchedAnalytics;
                    d4fVar2 = corpCreatingDraftModalView.pageInfo;
                    ej6Var2.b(d4fVar2.h, InputFieldType.USER_NAME);
                    break;
                }
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    ej6Var3 = corpCreatingDraftModalView.branchedAnalytics;
                    d4fVar3 = corpCreatingDraftModalView.pageInfo;
                    ej6Var3.b(d4fVar3.h, InputFieldType.EMAIL);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ej6Var4 = corpCreatingDraftModalView.branchedAnalytics;
                    d4fVar4 = corpCreatingDraftModalView.pageInfo;
                    ej6Var4.b(d4fVar4.h, InputFieldType.PHONE);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
