package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.c;

/* loaded from: classes.dex */
public final class bmk extends c implements iee {
    public final /* synthetic */ int b;
    public final vlk c;

    public /* synthetic */ bmk(vlk vlkVar, int i) {
        this.b = i;
        this.c = vlkVar;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    vlk vlkVar = this.c;
                    Object obj2 = vlkVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && vlkVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.c.containsKey(obj);
        }
    }

    @Override // defpackage.w5
    public final int f() {
        switch (this.b) {
        }
        return this.c.e;
    }

    @Override // kotlin.collections.c, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                aat aatVar = this.c.d;
                bat[] batVarArr = new bat[8];
                for (int i = 0; i < 8; i++) {
                    batVarArr[i] = new cat(0);
                }
                return new cmk(aatVar, batVarArr);
            default:
                aat aatVar2 = this.c.d;
                bat[] batVarArr2 = new bat[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    batVarArr2[i2] = new cat(1);
                }
                return new cmk(aatVar2, batVarArr2);
        }
    }
}
