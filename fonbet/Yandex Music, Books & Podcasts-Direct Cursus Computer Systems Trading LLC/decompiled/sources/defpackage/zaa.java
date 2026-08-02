package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class zaa implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmo b;

    public /* synthetic */ zaa(mmo mmoVar, int i) {
        this.a = i;
        this.b = mmoVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                eba ebaVar = (eba) obj;
                mmo mmoVar = this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) mmoVar.g;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) mmoVar.f;
                LinkedHashSet linkedHashSet3 = (LinkedHashSet) mmoVar.e;
                dba dbaVar = ebaVar.a;
                Collection collection = ebaVar.b;
                int ordinal = dbaVar.ordinal();
                if (ordinal == 0) {
                    Collection collection2 = collection;
                    z75.t(linkedHashSet3, collection2);
                    z75.y(linkedHashSet2, collection2);
                    z75.y(linkedHashSet, collection2);
                    mmoVar.B0();
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    Collection collection3 = collection;
                    z75.y(linkedHashSet3, collection3);
                    z75.y(linkedHashSet2, collection3);
                    z75.y(linkedHashSet, collection3);
                    mmoVar.B0();
                }
                break;
            default:
                qaa qaaVar = (qaa) obj;
                String str = qaaVar.a;
                boolean z = qaaVar.b;
                mmo mmoVar2 = this.b;
                LinkedHashSet linkedHashSet4 = (LinkedHashSet) mmoVar2.f;
                LinkedHashSet linkedHashSet5 = (LinkedHashSet) mmoVar2.e;
                if (!linkedHashSet5.contains(str)) {
                    linkedHashSet5.add(str);
                    ssg.a(7, "DownloadNotificationViewModelImpl", "Unexpected " + str, null);
                }
                LinkedHashSet linkedHashSet6 = (LinkedHashSet) mmoVar2.g;
                if (z) {
                    linkedHashSet6.remove(str);
                    linkedHashSet4.add(str);
                } else {
                    linkedHashSet6.add(str);
                    linkedHashSet4.remove(str);
                }
                mmoVar2.B0();
                break;
        }
        return Unit.a;
    }
}
