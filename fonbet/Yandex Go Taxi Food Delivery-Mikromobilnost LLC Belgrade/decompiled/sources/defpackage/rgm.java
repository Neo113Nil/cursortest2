package defpackage;

import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;

/* loaded from: classes12.dex */
public final class rgm implements jpo {
    public final DriveHostView a;
    public final ahm b;

    public rgm(DriveHostView driveHostView, ahm ahmVar) {
        this.a = driveHostView;
        this.b = ahmVar;
        final int i = 0;
        driveHostView.setInterceptOnBackPress(false);
        driveHostView.setHideHandler(new sls(this) { // from class: qgm
            public final /* synthetic */ rgm b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                rgm rgmVar = this.b;
                switch (i2) {
                    case 0:
                        rgmVar.b.Kg();
                        break;
                    default:
                        ahm ahmVar2 = rgmVar.b;
                        ahmVar2.B.c.g(zy11Var);
                        ((xgm) ahmVar2.Dg()).z5(true);
                        ahmVar2.L = true;
                        if (((xgm) ahmVar2.Dg()).isCollapsed()) {
                            ((xgm) ahmVar2.Dg()).expand();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
        final int i2 = 1;
        driveHostView.setDefaultModeHandler(new sls(this) { // from class: qgm
            public final /* synthetic */ rgm b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                rgm rgmVar = this.b;
                switch (i22) {
                    case 0:
                        rgmVar.b.Kg();
                        break;
                    default:
                        ahm ahmVar2 = rgmVar.b;
                        ahmVar2.B.c.g(zy11Var);
                        ((xgm) ahmVar2.Dg()).z5(true);
                        ahmVar2.L = true;
                        if (((xgm) ahmVar2.Dg()).isCollapsed()) {
                            ((xgm) ahmVar2.Dg()).expand();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        });
        driveHostView.setDraggableHandler(new zvi(25, this));
    }
}
