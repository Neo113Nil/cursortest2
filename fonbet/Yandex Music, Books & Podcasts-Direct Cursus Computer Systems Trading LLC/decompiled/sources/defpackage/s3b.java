package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s3b implements yn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public s3b(EmojiCompatInitializer emojiCompatInitializer, nyf nyfVar) {
        this.a = 0;
        this.b = nyfVar;
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        switch (this.a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? z36.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new q(17), 500L);
                ((nyf) this.b).d(this);
                break;
            case 1:
                dzfVar.getClass();
                nee neeVar = (nee) this.b;
                r2f r2fVar = neeVar.e;
                Continuation continuation = null;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                neeVar.e = x97.y(neeVar.b, null, null, new mee(neeVar, "restore_purchase_receiver_resume", continuation, 1), 3);
                break;
            default:
                dzfVar.getClass();
                r2q r2qVar = (r2q) this.b;
                boolean z = etn.z(r2qVar.b, "android.permission.POST_NOTIFICATIONS") == 0;
                boolean booleanValue = ((Boolean) r2qVar.d.getValue()).booleanValue();
                if (!z && booleanValue) {
                    r2qVar.a(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s3b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
