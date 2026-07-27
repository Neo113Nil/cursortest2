package D2;

import android.net.Uri;
import android.text.TextUtils;
import androidx.emoji2.text.o;
import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import java.util.Map;
import kotlin.jvm.internal.h;
import y0.c;
import y0.d;

/* loaded from: classes.dex */
public final class b implements o, d {

    /* renamed from: v, reason: collision with root package name */
    public static b f632v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f633n;

    /* renamed from: u, reason: collision with root package name */
    public String f634u;

    public /* synthetic */ b(String str, int i) {
        this.f633n = i;
        this.f634u = str;
    }

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f634u).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // y0.d
    public String b() {
        return this.f634u;
    }

    public String toString() {
        switch (this.f633n) {
            case 1:
                return "<" + this.f634u + '>';
            default:
                return super.toString();
        }
    }

    @Override // androidx.emoji2.text.o
    public boolean v(CharSequence charSequence, int i, int i6, u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i6), this.f634u)) {
            return true;
        }
        uVar.f4805c = (uVar.f4805c & 3) | 4;
        return false;
    }

    public b(int i) {
        this.f633n = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f634u = (String) AbstractC2968bG.f29254C.r();
                break;
        }
    }

    public b(String query) {
        this.f633n = 5;
        h.e(query, "query");
        this.f634u = query;
    }

    @Override // androidx.emoji2.text.o
    public Object getResult() {
        return this;
    }

    @Override // y0.d
    public void i(c cVar) {
    }
}
