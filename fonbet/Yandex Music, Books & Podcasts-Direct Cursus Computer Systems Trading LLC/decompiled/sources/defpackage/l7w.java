package defpackage;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.passport.internal.ui.authsdk.z;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class l7w implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7w(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.a;
        BottomSheetBehavior bottomSheetBehavior = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                m7w m7wVar = (m7w) obj;
                m7wVar.setOnShowListener(null);
                m7wVar.r.invoke(m7wVar);
                break;
            default:
                ze3 ze3Var = (ze3) ((z) obj).getDialog();
                if (ze3Var != null) {
                    FrameLayout frameLayout = (FrameLayout) ze3Var.findViewById(R.id.design_bottom_sheet);
                    frameLayout.getClass();
                    bottomSheetBehavior = BottomSheetBehavior.from(frameLayout);
                }
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                    break;
                }
                break;
        }
    }
}
