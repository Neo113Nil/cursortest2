package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;
import com.yandex.plus.core.network.hosts.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class ra6 implements ObjectConstructor, a {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ra6(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.yandex.plus.core.network.hosts.a
    public String e() {
        return this.b;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object f() {
        switch (this.a) {
            case 0:
                throw new JsonIOException(this.b);
            case 1:
                throw new JsonIOException(this.b);
            case 2:
                throw new JsonIOException(this.b);
            default:
                throw new JsonIOException(this.b);
        }
    }
}
