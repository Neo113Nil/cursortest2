package ru.yandex.music.data.user;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.auth.LegacyAccountType;
import defpackage.f1d;
import defpackage.su4;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/yandex/music/data/user/UserDto;", "Ljava/io/Serializable;", "", LegacyAccountType.STRING_LOGIN, "username", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLogin", "()Ljava/lang/String;", "getUsername", "getUid", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class UserDto implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName(LegacyAccountType.STRING_LOGIN)
    private final String login;

    @SerializedName("uid")
    private final String uid;

    @SerializedName("name")
    private final String username;

    public UserDto(String str, String str2, String str3) {
        this.login = str;
        this.username = str2;
        this.uid = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDto)) {
            return false;
        }
        UserDto userDto = (UserDto) obj;
        return Intrinsics.d(this.login, userDto.login) && Intrinsics.d(this.username, userDto.username) && Intrinsics.d(this.uid, userDto.uid);
    }

    public final int hashCode() {
        String str = this.login;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uid;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.login;
        String str2 = this.username;
        return su4.o(f1d.m("UserDto(login=", str, ", username=", str2, ", uid="), this.uid, ")");
    }
}
