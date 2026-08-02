package defpackage;

import com.yandex.go.utils.storage.json.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

/* loaded from: classes10.dex */
public final class y451 {
    public final a a;

    public y451(eex eexVar) {
        am2 am2Var = new am2("mlutp", "inapp-widgets.json", EmptyList.a);
        KSerializer serializer = ae7.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.a(am2Var, new p53(serializer, 0));
    }
}
