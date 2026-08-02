package ru.yandex.taxi.favorites.edit.arguments;

import android.os.Parcel;
import com.yandex.go.address.models.FavoriteAddress;
import kotlin.Metadata;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/favorites/edit/arguments/Existing;", "Lru/yandex/taxi/favorites/edit/arguments/EditArguments;", "Lcom/yandex/go/address/models/FavoriteAddress;", "address", "<init>", "(Lcom/yandex/go/address/models/FavoriteAddress;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/go/address/models/FavoriteAddress;", "getAddress", "()Lcom/yandex/go/address/models/FavoriteAddress;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Existing extends EditArguments {
    public static final int $stable = 8;
    private final FavoriteAddress address;

    public Existing(Parcel parcel) {
        this((FavoriteAddress) parcel.readSerializable());
    }

    @Override // ru.yandex.taxi.favorites.edit.arguments.EditArguments
    public FavoriteAddress getAddress() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(EditArguments.Type.EXISTING);
        dest.writeSerializable(getAddress());
    }

    public Existing(FavoriteAddress favoriteAddress) {
        super(null);
        this.address = favoriteAddress;
    }
}
