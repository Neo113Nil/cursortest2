package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.cover.upload.UploadCoverService;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes4.dex */
public final /* synthetic */ class kxc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz7 b;

    public /* synthetic */ kxc(iz7 iz7Var, int i) {
        this.a = i;
        this.b = iz7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UploadCoverService uploadCoverService = (UploadCoverService) obj;
        switch (this.a) {
            case 0:
                uploadCoverService.getClass();
                iz7 iz7Var = this.b;
                ixc ixcVar = (ixc) iz7Var.d;
                if (ixcVar == null) {
                    Intrinsics.j("data");
                    throw null;
                }
                String str = ixcVar.a;
                if (str != null) {
                    String str2 = ixcVar.b;
                    lxc lxcVar = (lxc) iz7Var.h;
                    str2.getClass();
                    lxcVar.getClass();
                    Assertions.assertUIThread();
                    Set set = (Set) uploadCoverService.e.get(new Pair(str, str2));
                    if (set != null) {
                        set.remove(lxcVar);
                    }
                    uploadCoverService.c();
                } else {
                    dfi.r("Can't change album cover", "FullInfoPresenter");
                }
                return Unit.a;
            case 1:
                uploadCoverService.getClass();
                iz7 iz7Var2 = this.b;
                ixc ixcVar2 = (ixc) iz7Var2.d;
                if (ixcVar2 == null) {
                    Intrinsics.j("data");
                    throw null;
                }
                String str3 = ixcVar2.a;
                if (str3 != null) {
                    String str4 = ixcVar2.b;
                    str4.getClass();
                    Assertions.assertUIThread();
                    ArrayList arrayList = uploadCoverService.d;
                    boolean z = false;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                pot potVar = (pot) it.next();
                                if (Intrinsics.d(potVar.a, str3) && Intrinsics.d(potVar.b, str4)) {
                                    z = true;
                                }
                            }
                        }
                    }
                    iz7Var2.q(z, ((z66) ((jyr) iz7Var2.f).getValue()).g());
                } else {
                    dfi.r("Can't change album cover", "FullInfoPresenter");
                }
                return Unit.a;
            default:
                uploadCoverService.getClass();
                iz7 iz7Var3 = this.b;
                g06 g06Var = (g06) iz7Var3.g;
                kxc kxcVar = new kxc(iz7Var3, 1);
                Object obj2 = g06Var.d;
                if (obj2 != null) {
                    kxcVar.invoke(obj2);
                }
                ixc ixcVar3 = (ixc) iz7Var3.d;
                if (ixcVar3 == null) {
                    Intrinsics.j("data");
                    throw null;
                }
                String str5 = ixcVar3.a;
                if (str5 != null) {
                    String str6 = ixcVar3.b;
                    lxc lxcVar2 = (lxc) iz7Var3.h;
                    str6.getClass();
                    lxcVar2.getClass();
                    Assertions.assertUIThread();
                    Pair pair = new Pair(str5, str6);
                    HashMap hashMap = uploadCoverService.e;
                    Set set2 = (Set) hashMap.get(pair);
                    if (set2 == null) {
                        set2 = new HashSet();
                    }
                    set2.add(lxcVar2);
                    hashMap.put(new Pair(str5, str6), set2);
                    uploadCoverService.c();
                } else {
                    dfi.r("Can't change album cover", "FullInfoPresenter");
                }
                return Unit.a;
        }
    }
}
