package defpackage;

import android.view.View;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.view.QrReaderErrorView;
import com.ybsdk.widgets.common.ToolbarView;

/* loaded from: classes3.dex */
public final /* synthetic */ class xbg0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ xbg0(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                QrReaderErrorView.setGoToSettingsButtonClickListener$lambda$0(slsVar, view);
                break;
            case 1:
                slsVar.invoke();
                break;
            case 2:
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 3:
                slsVar.invoke();
                break;
            case 4:
                slsVar.invoke();
                break;
            case 5:
                slsVar.invoke();
                break;
            case 6:
                slsVar.invoke();
                break;
            case 7:
                slsVar.invoke();
                break;
            case 8:
                slsVar.invoke();
                break;
            case 9:
                slsVar.invoke();
                break;
            case 10:
                slsVar.invoke();
                break;
            case 11:
                ToolbarView.setOnCloseButtonClickListener$lambda$3(slsVar, view);
                break;
            case 12:
                slsVar.invoke();
                break;
            case 13:
                slsVar.invoke();
                break;
            case 14:
                slsVar.invoke();
                break;
            case 15:
                slsVar.invoke();
                break;
            case 16:
                slsVar.invoke();
                break;
            case 17:
                slsVar.invoke();
                break;
            case 18:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
    }
}
