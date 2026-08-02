package ru.yandex.taxi.favorites.housemissing;

import defpackage.ad5;
import defpackage.aip;
import defpackage.atu;
import defpackage.bdc;
import defpackage.e9s;
import defpackage.ftu;
import defpackage.htu;
import defpackage.i4u;
import defpackage.lcb1;
import defpackage.my6;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zsu;
import defpackage.zy6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class b extends ad5 {
    public final aip A;
    public final i4u B;
    public final FavoritesCreateRegularAddressExperiment C;
    public final String D;
    public final c x;
    public final pwy0 y;
    public final e z;

    public b(c cVar, pwy0 pwy0Var, e eVar, aip aipVar, i4u i4uVar, FavoritesCreateRegularAddressExperiment favoritesCreateRegularAddressExperiment, String str) {
        super(ftu.class);
        this.x = cVar;
        this.y = pwy0Var;
        this.z = eVar;
        this.A = aipVar;
        this.B = i4uVar;
        this.C = favoritesCreateRegularAddressExperiment;
        this.D = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008b -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(b bVar, ContinuationImpl continuationImpl) {
        HouseMissingPresenter$createButtons$1 houseMissingPresenter$createButtons$1;
        int i;
        Iterator it;
        Collection collection;
        zy6 zy6Var;
        my6 a;
        FavoritesCreateRegularAddressExperiment favoritesCreateRegularAddressExperiment = bVar.C;
        if (continuationImpl instanceof HouseMissingPresenter$createButtons$1) {
            houseMissingPresenter$createButtons$1 = (HouseMissingPresenter$createButtons$1) continuationImpl;
            int i2 = houseMissingPresenter$createButtons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                houseMissingPresenter$createButtons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = houseMissingPresenter$createButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = houseMissingPresenter$createButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = favoritesCreateRegularAddressExperiment.g;
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    FavoritesCreateRegularAddressExperiment.a aVar = (FavoritesCreateRegularAddressExperiment.a) houseMissingPresenter$createButtons$1.L$7;
                    it = (Iterator) houseMissingPresenter$createButtons$1.L$4;
                    collection = (Collection) houseMissingPresenter$createButtons$1.L$2;
                    kotlin.b.b(obj);
                    CharSequence charSequence = (CharSequence) obj;
                    int i3 = htu.a[aVar.c.ordinal()];
                    if (i3 == 1) {
                        zy6Var = atu.a;
                    } else if (i3 == 2) {
                        zy6Var = zsu.a;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        a = null;
                        if (a != null) {
                            collection.add(a);
                        }
                        if (!it.hasNext()) {
                            return (List) collection;
                        }
                        aVar = (FavoritesCreateRegularAddressExperiment.a) it.next();
                        c cVar = bVar.x;
                        FormattedText b = e9s.b(aVar.a, favoritesCreateRegularAddressExperiment);
                        houseMissingPresenter$createButtons$1.L$0 = null;
                        houseMissingPresenter$createButtons$1.L$1 = null;
                        houseMissingPresenter$createButtons$1.L$2 = collection;
                        houseMissingPresenter$createButtons$1.L$3 = null;
                        houseMissingPresenter$createButtons$1.L$4 = it;
                        houseMissingPresenter$createButtons$1.L$5 = null;
                        houseMissingPresenter$createButtons$1.L$6 = null;
                        houseMissingPresenter$createButtons$1.L$7 = aVar;
                        houseMissingPresenter$createButtons$1.label = 1;
                        obj = c.i(cVar, b, null, houseMissingPresenter$createButtons$1, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        CharSequence charSequence2 = (CharSequence) obj;
                        int i32 = htu.a[aVar.c.ordinal()];
                        if (i32 == 1) {
                        }
                    }
                    zy6 zy6Var2 = zy6Var;
                    int i4 = htu.b[aVar.b.ordinal()];
                    if (i4 == 1) {
                        my6 my6Var = my6.k;
                        a = lcb1.a(charSequence2.toString(), zy6Var2);
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        my6 my6Var2 = my6.k;
                        String obj2 = charSequence2.toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a = new my6(obj2, new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor), TextStyle.DEFAULT, zy6Var2, null, null, false, false, 16292);
                    }
                    if (a != null) {
                    }
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        houseMissingPresenter$createButtons$1 = new HouseMissingPresenter$createButtons$1(bVar, continuationImpl);
        Object obj3 = houseMissingPresenter$createButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = houseMissingPresenter$createButtons$1.label;
        if (i != 0) {
        }
    }
}
