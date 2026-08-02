package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* loaded from: classes15.dex */
public final /* synthetic */ class ywc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4n b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ywc(j4n j4nVar, Runnable runnable, int i) {
        this.a = i;
        this.b = j4nVar;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Runnable runnable = this.c;
        j4n j4nVar = this.b;
        switch (i) {
            case 0:
                ((BottomSheetDialog) j4nVar.b).dismiss();
                Toast.makeText((Context) j4nVar.a, (String) j4nVar.w, 0).show();
                runnable.run();
                break;
            default:
                ((BottomSheetDialog) j4nVar.b).dismiss();
                Toast.makeText((Context) j4nVar.a, (String) j4nVar.w, 0).show();
                runnable.run();
                break;
        }
    }
}
