package defpackage;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ayt extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final EditText c;
    public uif d;

    public ayt(Context context) {
        super(context);
        TextView textView = new TextView(getContext());
        a(textView);
        this.a = textView;
        TextView textView2 = new TextView(getContext());
        a(textView2);
        this.b = textView2;
        final EditText editText = new EditText(getContext());
        a(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zxt
            /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, uif] */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                if ((keyEvent != null && keyEvent.getAction() != 0) || i != 6) {
                    return false;
                }
                ayt.this.d.invoke(editText.getText().toString());
                return true;
            }
        });
        this.c = editText;
        this.d = rvr.A0;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addView(textView, new LinearLayout.LayoutParams(bg3.x(200, getResources().getDisplayMetrics()), -1));
        addView(textView2, new LinearLayout.LayoutParams(bg3.x(60, getResources().getDisplayMetrics()), -1));
        addView(editText, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }

    public static void a(TextView textView) {
        int x = bg3.x(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(x, x, x, x);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R.drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }
}
