package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.formatter.FormatTextWatcher;
import com.ybsdk.widgets.common.LoadableInput;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class w921 {
    public final LoadableInput a;
    public final RecyclerView b;
    public final qa3 c;
    public List d = EmptyList.a;
    public FormatTextWatcher e = null;

    public w921(LoadableInput loadableInput, RecyclerView recyclerView, qa3 qa3Var) {
        this.a = loadableInput;
        this.b = recyclerView;
        this.c = qa3Var;
    }

    public final List a() {
        return this.d;
    }

    public final FormatTextWatcher b() {
        return this.e;
    }

    public final LoadableInput c() {
        return this.a;
    }

    public final qa3 d() {
        return this.c;
    }

    public final RecyclerView e() {
        return this.b;
    }

    public final void f(List list) {
        this.d = list;
    }

    public final void g(FormatTextWatcher formatTextWatcher) {
        this.e = formatTextWatcher;
    }
}
