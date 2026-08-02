package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class yjg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fkg l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yjg(fkg fkgVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fkgVar;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new yjg(this.l, this.m, continuation, 0);
            case 1:
                return new yjg(this.l, this.m, continuation, 1);
            case 2:
                return new yjg(this.l, this.m, continuation, 2);
            case 3:
                return new yjg(this.l, this.m, continuation, 3);
            default:
                return new yjg(this.l, this.m, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((yjg) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        List w0;
        int i = this.j;
        String str = this.m;
        fkg fkgVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                Object[] objArr = 0;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = x97.V(dm6.b, new zjg(this.l, this.m, "album", objArr == true ? 1 : 0, 2), this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Parcel parcel = (Parcel) obj;
                if (parcel == null) {
                    return null;
                }
                Object obj2 = oq.class.getDeclaredField("CREATOR").get(null);
                Parcelable.Creator creator = obj2 instanceof Parcelable.Creator ? (Parcelable.Creator) obj2 : null;
                if (creator == null) {
                    xq0.x(f1d.g("Could not access CREATOR field in class ", ern.a(oq.class).h()));
                    return null;
                }
                Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
                parcel.recycle();
                return parcelable;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                Object[] objArr2 = 0;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = x97.V(dm6.b, new zjg(this.l, this.m, "artist", objArr2 == true ? 1 : 0, 2), this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Parcel parcel2 = (Parcel) obj;
                if (parcel2 == null) {
                    return null;
                }
                Object obj3 = c01.class.getDeclaredField("CREATOR").get(null);
                Parcelable.Creator creator2 = obj3 instanceof Parcelable.Creator ? (Parcelable.Creator) obj3 : null;
                if (creator2 == null) {
                    xq0.x(f1d.g("Could not access CREATOR field in class ", ern.a(c01.class).h()));
                    return null;
                }
                Parcelable parcelable2 = (Parcelable) creator2.createFromParcel(parcel2);
                parcel2.recycle();
                return parcelable2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                Object[] objArr3 = 0;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = x97.V(dm6.b, new zjg(this.l, this.m, "playlist", objArr3 == true ? 1 : 0, 2), this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Parcel parcel3 = (Parcel) obj;
                if (parcel3 == null) {
                    return null;
                }
                Object obj4 = cvl.class.getDeclaredField("CREATOR").get(null);
                Parcelable.Creator creator3 = obj4 instanceof Parcelable.Creator ? (Parcelable.Creator) obj4 : null;
                if (creator3 == null) {
                    xq0.x(f1d.g("Could not access CREATOR field in class ", ern.a(cvl.class).h()));
                    return null;
                }
                Parcelable parcelable3 = (Parcelable) creator3.createFromParcel(parcel3);
                parcel3.recycle();
                return parcelable3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = fkg.c(fkgVar, str, "possibleTracks", this);
                    if (obj == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Collection collection = (Collection) obj;
                return (collection == null || (w0 = CollectionsKt.w0(collection)) == null) ? c5b.a : w0;
            default:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object b = fkg.b(fkgVar, str, "videoId", this);
                    return b == nm6Var5 ? nm6Var5 : b;
                }
                if (i6 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
