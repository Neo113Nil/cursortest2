package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vxt extends LinearLayout {
    public final Context a;
    public final mxt b;
    public final LinearLayout c;

    public vxt(@NotNull Context context, @NotNull uxt uxtVar) {
        super(context);
        this.a = context;
        this.b = new mxt(new w40(3, uxtVar, uxt.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        List h = u75.h(200, 60, 100);
        List<String> h2 = u75.h("name", "type", Constants.KEY_VALUE);
        ArrayList arrayList = new ArrayList(v75.o(h2, 10));
        for (String str : h2) {
            TextView textView = new TextView(context);
            int x = bg3.x(8, textView.getResources().getDisplayMetrics());
            textView.setPadding(x, x, x, x);
            textView.setTextColor(-1);
            textView.setText(str);
            textView.setTypeface(textView.getTypeface(), 1);
            arrayList.add(textView);
        }
        Iterator it = CollectionsKt.C0(arrayList, h).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linearLayout.addView((TextView) pair.a, new LinearLayout.LayoutParams(bg3.x(Integer.valueOf(((Number) pair.b).intValue()), linearLayout.getResources().getDisplayMetrics()), -2));
        }
        this.c = linearLayout;
        setOrientation(1);
        uxtVar.c = new lgq(1, this, vxt.class, "updateTable", "updateTable(Ljava/util/List;)V", 0, 18);
        uxtVar.a();
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(this.a);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.b);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        addView(recyclerView, new LinearLayout.LayoutParams(-1, -2));
    }
}
