package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import com.google.android.material.overflow.OverflowLinearLayout;

/* loaded from: classes10.dex */
public final /* synthetic */ class qc2 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qc2(uiz0 uiz0Var, dil dilVar, int i) {
        this.a = 3;
        this.b = uiz0Var;
        this.c = dilVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean lambda$handleOverflowButtonClick$1;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((hly0) obj2).d.invoke(((rc2) obj).a);
                break;
            case 1:
                lambda$handleOverflowButtonClick$1 = OverflowLinearLayout.lambda$handleOverflowButtonClick$1((View) obj2, (MenuItem) obj, menuItem);
                break;
            case 2:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT < 34) {
                    activity.send();
                    break;
                } else {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                        break;
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                        break;
                    }
                }
            default:
                uiz0 uiz0Var = (uiz0) obj2;
                uiz0Var.a.handleUri(((dil) obj).b);
                ((bei) uiz0Var.c.e).getClass();
                break;
        }
        return true;
        return true;
    }

    public /* synthetic */ qc2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
