package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.utils.ColorModel;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public abstract class rje {
    public static final int a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final void b(Context context, CharSequence charSequence, CharSequence charSequence2) {
        Object failure;
        Object obj;
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            try {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence2, charSequence));
                obj = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        } else {
            obj = null;
        }
        failure = obj;
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to copyToClipboard", a, null, null, 12);
        }
    }

    public static final float c(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return TypedValue.complexToFloat(typedValue.data);
    }

    public static final int d(int i, Context context) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final ColorModel e(TypedArray typedArray, int i, ColorModel colorModel) {
        int color = typedArray.getColor(i, 0);
        return color == 0 ? colorModel : new ColorModel.Raw(color);
    }

    public static final String f(Context context) {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            if (primaryClip.getItemCount() <= 0) {
                primaryClip = null;
            }
            if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                return text.toString();
            }
        }
        return null;
    }

    public static final boolean g(FragmentActivity fragmentActivity, String str) {
        return fragmentActivity.checkSelfPermission(str) == 0;
    }

    public static final boolean h(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final void i(Context context, String str) {
        try {
            k(context, new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(SelfTester_JCP.IMITA));
        } catch (Throwable unused) {
        }
    }

    public static final Drawable j(int i, Context context) {
        Drawable t = vng.t(i, context);
        if (t != null) {
            return t;
        }
        dac.f(context.getResources().getResourceEntryName(i), "No drawable with id: ");
        return null;
    }

    public static final boolean k(Context context, Intent intent) {
        Object failure;
        try {
            context.startActivity(intent);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Exception during safeStartActivity() in ContextExt", a, null, null, 12);
        }
        return !(failure instanceof Result.Failure);
    }

    public static void l(int i, Context context) {
        Toast.makeText(context, i, 1).show();
    }

    public static void m(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }
}
