package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.yandex.passport.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class kwd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ kwd(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                break;
            case 1:
                ((l13) obj).getClass();
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                Toast.makeText(this.b, str, 0).show();
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                Toast.makeText(this.b, str2, 0).show();
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                Toast.makeText(this.b, str3, 0).show();
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                Context context = this.b;
                Object systemService = context.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("errorInfo", str4));
                Toast.makeText(context, context.getString(R.string.passport_error_slab_toast_text), 0).show();
                break;
        }
        return Unit.a;
    }
}
