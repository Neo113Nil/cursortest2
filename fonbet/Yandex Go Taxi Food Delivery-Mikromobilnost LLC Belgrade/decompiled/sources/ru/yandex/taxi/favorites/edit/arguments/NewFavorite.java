package ru.yandex.taxi.favorites.edit.arguments;

import android.os.Parcel;
import com.yandex.go.address.models.FavoriteAddress;
import kotlin.Metadata;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/favorites/edit/arguments/NewFavorite;", "Lru/yandex/taxi/favorites/edit/arguments/EditArguments;", "Lcom/yandex/go/address/models/FavoriteAddress;", "address", "", "isPointAcquisitionTypeUserLocation", "<init>", "(Lcom/yandex/go/address/models/FavoriteAddress;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/go/address/models/FavoriteAddress;", "getAddress", "()Lcom/yandex/go/address/models/FavoriteAddress;", "Z", "()Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NewFavorite extends EditArguments {
    public static final int $stable = 8;
    private final FavoriteAddress address;
    private final boolean isPointAcquisitionTypeUserLocation;

    public NewFavorite(Parcel parcel) {
        this((FavoriteAddress) parcel.readSerializable(), parcel.readInt() == 1);
    }

    @Override // ru.yandex.taxi.favorites.edit.arguments.EditArguments
    public FavoriteAddress getAddress() {
        return this.address;
    }

    /* renamed from: isPointAcquisitionTypeUserLocation, reason: from getter */
    public final boolean getIsPointAcquisitionTypeUserLocation() {
        return this.isPointAcquisitionTypeUserLocation;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(EditArguments.Type.NEW_FAVORITE);
        dest.writeSerializable(getAddress());
        dest.writeInt(this.isPointAcquisitionTypeUserLocation ? 1 : 0);
    }

    public NewFavorite(FavoriteAddress favoriteAddress, boolean z) {
        super(null);
        this.address = favoriteAddress;
        this.isPointAcquisitionTypeUserLocation = z;
    }
}
