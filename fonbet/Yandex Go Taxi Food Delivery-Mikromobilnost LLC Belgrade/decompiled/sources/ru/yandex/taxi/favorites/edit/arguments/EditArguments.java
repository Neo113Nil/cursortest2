package ru.yandex.taxi.favorites.edit.arguments;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.go.address.models.FavoriteAddress;
import defpackage.k4o;
import defpackage.w511;
import defpackage.wkn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/favorites/edit/arguments/EditArguments;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Lcom/yandex/go/address/models/FavoriteAddress;", "getAddress", "()Lcom/yandex/go/address/models/FavoriteAddress;", "address", "Companion", "Type", "wkn", "Lru/yandex/taxi/favorites/edit/arguments/Existing;", "Lru/yandex/taxi/favorites/edit/arguments/NewFavorite;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class EditArguments implements Parcelable {
    public static final int $stable = 8;
    public static final wkn Companion = new wkn();
    public static final Parcelable.Creator<EditArguments> CREATOR = new Parcelable.Creator<EditArguments>() { // from class: ru.yandex.taxi.favorites.edit.arguments.EditArguments$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public EditArguments createFromParcel(Parcel source) {
            int i = a.a[((EditArguments.Type) source.readSerializable()).ordinal()];
            if (i == 1) {
                return new NewFavorite(source);
            }
            if (i == 2) {
                return new Existing(source);
            }
            w511.b();
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public EditArguments[] newArray(int size) {
            return new EditArguments[size];
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/favorites/edit/arguments/EditArguments$Type;", "", "EXISTING", "NEW_FAVORITE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type EXISTING;
        public static final Type NEW_FAVORITE;

        static {
            Type type = new Type("EXISTING", 0);
            EXISTING = type;
            Type type2 = new Type("NEW_FAVORITE", 1);
            NEW_FAVORITE = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ EditArguments(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract FavoriteAddress getAddress();

    private EditArguments() {
    }
}
