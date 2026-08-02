package E2;

import android.text.TextUtils;
import android.util.JsonWriter;

/* renamed from: E2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316m implements androidx.emoji2.text.o, x2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f850n;

    /* renamed from: u, reason: collision with root package name */
    public String f851u;

    @Override // x2.e
    public /* synthetic */ void j(JsonWriter jsonWriter) {
        Object obj = x2.f.f41859b;
        jsonWriter.name("params").beginObject();
        String str = this.f851u;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f850n) {
            case 1:
                return "<" + this.f851u + '>';
            default:
                return super.toString();
        }
    }

    @Override // androidx.emoji2.text.o
    public boolean y(CharSequence charSequence, int i, int i4, androidx.emoji2.text.u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i4), this.f851u)) {
            return true;
        }
        uVar.f4773c = (uVar.f4773c & 3) | 4;
        return false;
    }

    public /* synthetic */ C0316m(String str, int i) {
        this.f850n = i;
        this.f851u = str;
    }

    @Override // androidx.emoji2.text.o
    public Object getResult() {
        return this;
    }
}
