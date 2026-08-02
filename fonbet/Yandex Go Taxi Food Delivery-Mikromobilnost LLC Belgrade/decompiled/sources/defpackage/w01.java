package defpackage;

import com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ w01(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue(null);
                break;
            case 1:
                rzx rzxVar = (rzx) oz40Var.getValue();
                if (rzxVar == null) {
                    lxv.d("Required value was null.");
                    ny61.A();
                    break;
                } else {
                    break;
                }
            case 2:
                rzx rzxVar2 = (rzx) oz40Var.getValue();
                if (rzxVar2 == null) {
                    lxv.d("Required value was null.");
                    ny61.A();
                    break;
                } else {
                    break;
                }
            case 3:
                if (oz40Var != null) {
                    break;
                }
                break;
            case 4:
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                break;
            case 5:
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                break;
            case 6:
                ((sls) oz40Var.getValue()).invoke();
                break;
            case 7:
                CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$8(oz40Var, true);
                break;
            case 8:
                CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$8(oz40Var, true);
                break;
            case 9:
                CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$8(oz40Var, false);
                break;
            case 10:
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                oz40Var.setValue(Boolean.TRUE);
                break;
            case 15:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 16:
                oz40Var.setValue(null);
                break;
            case 17:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 18:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 19:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 20:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 21:
                rzx rzxVar3 = (rzx) oz40Var.getValue();
                if (rzxVar3 == null) {
                    lxv.d("Required value was null.");
                    ny61.A();
                    break;
                } else {
                    break;
                }
            case 22:
                break;
            case 23:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 24:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 25:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 26:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 27:
                oz40Var.setValue(Boolean.TRUE);
                break;
            case 28:
                oz40Var.setValue(Boolean.TRUE);
                break;
            default:
                oz40Var.setValue(Boolean.TRUE);
                break;
        }
        return zy11Var;
    }
}
