package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mb0 extends Dialog {
    public final mj NCTxEWno;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(Context context, kb0 kb0Var, mj mjVar) {
        super(context);
        int i;
        kb0Var.getClass();
        this.NCTxEWno = mjVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_table_mood, (ViewGroup) null, false);
        int i2 = R.id.dialog_body;
        if (((TextView) n50.qoPGr6Ce(inflate, R.id.dialog_body)) != null) {
            i2 = R.id.dialog_close;
            AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.dialog_close);
            if (appCompatButton != null) {
                i2 = R.id.dialog_emoji;
                TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.dialog_emoji);
                if (textView != null) {
                    i2 = R.id.dialog_explore;
                    AppCompatButton appCompatButton2 = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.dialog_explore);
                    if (appCompatButton2 != null) {
                        i2 = R.id.dialog_mood_name;
                        TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.dialog_mood_name);
                        if (textView2 != null) {
                            i2 = R.id.dialog_title;
                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.dialog_title)) != null) {
                                setContentView((LinearLayout) inflate);
                                Window window = getWindow();
                                if (window != null) {
                                    window.setBackgroundDrawable(new ColorDrawable(0));
                                }
                                Window window2 = getWindow();
                                if (window2 != null) {
                                    window2.setLayout((int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.85f), -2);
                                }
                                int ordinal = kb0Var.ordinal();
                                if (ordinal == 0) {
                                    i = R.string.emoji_mood_calm;
                                } else if (ordinal == 1) {
                                    i = R.string.emoji_mood_bold;
                                } else if (ordinal == 2) {
                                    i = R.string.emoji_mood_fresh;
                                } else if (ordinal == 3) {
                                    i = R.string.emoji_mood_cozy;
                                } else {
                                    if (ordinal != 4) {
                                        throw new d7();
                                    }
                                    i = R.string.emoji_mood_intense;
                                }
                                textView.setText(i);
                                textView2.setText(g50.P7K7Inc8(kb0Var));
                                appCompatButton2.setOnClickListener(new lb0(this, 0));
                                appCompatButton.setOnClickListener(new lb0(this, 1));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
