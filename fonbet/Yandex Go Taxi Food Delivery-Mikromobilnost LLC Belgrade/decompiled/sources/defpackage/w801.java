package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.legacy.Alignment;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class w801 extends xok {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (r1.equals("center") == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    @Override // defpackage.ggk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(DivView divView, n15 n15Var) {
        ?? arrayList;
        Alignment alignment;
        ljl ljlVar = (ljl) n15Var;
        ArrayList arrayList2 = ljlVar.y;
        x3k x3kVar = (x3k) ljlVar.c;
        if (arrayList2.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            Iterator it = ljlVar.y.iterator();
            while (it.hasNext()) {
                kjl kjlVar = (kjl) it.next();
                if (xdb1.e(kjlVar.b)) {
                    arrayList.add(kjlVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Context context = divView.getContext();
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(wkh0.div_traffic_list, (ViewGroup) null);
        recyclerView.setAdapter(new u801(this, arrayList));
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        boolean z = false;
        linearLayoutManager.b2(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (x3kVar != null) {
            recyclerView.addOnItemTouchListener(new d(this, context, recyclerView));
        }
        recyclerView.addItemDecoration(new u590(0, context.getResources().getDimensionPixelSize(atg0.div_traffic_item_padding_horizontal), 0, 0, 0, 0, 0, 248));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        String str = ljlVar.x;
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    alignment = Alignment.CENTER;
                    break;
                case true:
                    alignment = Alignment.LEFT;
                    break;
                case true:
                    alignment = Alignment.RIGHT;
                    break;
                default:
                    z83.j("Unknown alignment: ".concat(str));
                    alignment = Alignment.LEFT;
                    break;
            }
        } else {
            alignment = Alignment.LEFT;
        }
        int i = t801.a[alignment.ordinal()];
        if (i == 1) {
            layoutParams.gravity = 3;
        } else if (i == 2) {
            layoutParams.gravity = 1;
        } else if (i != 3) {
            z83.j("Unknown value");
        } else {
            layoutParams.gravity = 5;
        }
        recyclerView.setLayoutParams(layoutParams);
        return recyclerView;
    }
}
