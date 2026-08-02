package ru.yandex.taxi.favorites.suggest;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.suggest.FavoriteSuggest;
import com.yandex.go.suggest.FavoriteSuggestResponse;
import defpackage.cmt;
import defpackage.g28;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uhp;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xhp;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lg28;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.suggest.FavoriteSuggestRepositoryImpl$suggests$1", f = "FavoriteSuggestRepositoryImpl.kt", l = {26, 30, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteSuggestRepositoryImpl$suggests$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteSuggestRepositoryImpl$suggests$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FavoriteSuggestRepositoryImpl$suggests$1 favoriteSuggestRepositoryImpl$suggests$1 = new FavoriteSuggestRepositoryImpl$suggests$1(this.this$0, continuation);
        favoriteSuggestRepositoryImpl$suggests$1.L$0 = obj;
        return favoriteSuggestRepositoryImpl$suggests$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoriteSuggestRepositoryImpl$suggests$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0078, code lost:
    
        if (r3 == r2) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        boolean z;
        zzs zzsVar;
        FavoriteSuggest.FavoriteInfoSuggest.FavoriteTimeInfoSuggest favoriteTimeInfoSuggest;
        FavoriteSuggest.FavoriteInfoSuggest.FavoriteTimeInfoSuggest favoriteTimeInfoSuggest2;
        FavoriteSuggest.FavoriteInfoSuggest.FavoriteTimeInfoSuggest favoriteTimeInfoSuggest3;
        String str;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        boolean z2 = true;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((xhp) this.this$0.b.a.b()).b) {
                cmt<FavoriteSuggestResponse> a2 = ((FavoritesSuggestApi) this.this$0.c.getValue()).a();
                a aVar = new a();
                this.L$0 = vprVar;
                this.label = 2;
                a = ru.yandex.taxi.network.api.a.a(a2, aVar, this);
            } else {
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(EmptyList.a, this) != obj2) {
                    return zy11Var;
                }
            }
            return obj2;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        if (i != 2) {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        a = obj;
        List list = ((FavoriteSuggestResponse) a).a;
        uhp uhpVar = this.this$0.a;
        boolean z3 = false;
        Set set = (Set) uhpVar.a.getValue(uhpVar, uhp.b[0]);
        HashSet hashSet = new HashSet();
        List<FavoriteSuggest> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (FavoriteSuggest favoriteSuggest : list2) {
            FavoriteSuggest.FavoriteInfoSuggest favoriteInfoSuggest = favoriteSuggest.b;
            FavoriteSuggest.FavoritePointSuggest favoritePointSuggest = favoriteSuggest.a;
            if (kotlin.collections.a.G(set, favoriteInfoSuggest != null ? favoriteInfoSuggest.a : null)) {
                if (favoriteInfoSuggest != null && (str = favoriteInfoSuggest.a) != null) {
                    hashSet.add(str);
                }
                z = z3;
            } else {
                z = z2;
            }
            String str2 = favoriteInfoSuggest != null ? favoriteInfoSuggest.a : null;
            String str3 = (favoriteInfoSuggest == null || (favoriteTimeInfoSuggest3 = favoriteInfoSuggest.c) == null) ? null : favoriteTimeInfoSuggest3.a;
            String str4 = (favoriteInfoSuggest == null || (favoriteTimeInfoSuggest2 = favoriteInfoSuggest.c) == null) ? null : favoriteTimeInfoSuggest2.b;
            String str5 = favoritePointSuggest != null ? favoritePointSuggest.a : null;
            if (str5 == null) {
                str5 = "";
            }
            FavoriteAddress.FavoriteTitle favoriteTitle = new FavoriteAddress.FavoriteTitle(str5);
            boolean z4 = z3;
            String str6 = favoritePointSuggest != null ? favoritePointSuggest.b : null;
            if (str6 == null) {
                str6 = "";
            }
            FavoriteAddress.FavoriteTitle favoriteTitle2 = new FavoriteAddress.FavoriteTitle(str6);
            String str7 = (favoriteInfoSuggest == null || (favoriteTimeInfoSuggest = favoriteInfoSuggest.c) == null) ? null : favoriteTimeInfoSuggest.a;
            String str8 = str7 == null ? "" : str7;
            if (favoritePointSuggest == null || (zzsVar = favoritePointSuggest.c) == null) {
                zzsVar = zzs.f;
            }
            arrayList.add(new g28(z, str2, str3, str4, new FavoriteAddress(null, str8, null, zzsVar, null, null, favoriteTitle, favoriteTitle2, null, null, null, null, null, null, null, null, favoritePointSuggest != null ? favoritePointSuggest.d : null, null, 3145323)));
            z3 = z4;
            z2 = true;
        }
        uhp uhpVar2 = this.this$0.a;
        uhpVar2.a.setValue(uhpVar2, uhp.b[z3 ? 1 : 0], hashSet);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (vprVar.emit(arrayList, this) == obj2) {
            return obj2;
        }
    }
}
