package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u0003\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/CommonCondition;", "", "", "isSelected", "isNightMode", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CommonCondition {

    @ysq0("isNightMode")
    private final Boolean isNightMode;

    @ysq0("isSelected")
    private final Boolean isSelected;

    public CommonCondition(Boolean bool, Boolean bool2) {
        this.isSelected = bool;
        this.isNightMode = bool2;
    }

    public final boolean a(boolean z, boolean z2) {
        Boolean bool = this.isSelected;
        if (bool != null && bool.booleanValue() != z) {
            return false;
        }
        Boolean bool2 = this.isNightMode;
        return bool2 == null || bool2.booleanValue() == z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCondition)) {
            return false;
        }
        CommonCondition commonCondition = (CommonCondition) obj;
        return jl40.l(this.isSelected, commonCondition.isSelected) && jl40.l(this.isNightMode, commonCondition.isNightMode);
    }

    public final int hashCode() {
        Boolean bool = this.isSelected;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isNightMode;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "CommonCondition(isSelected=" + this.isSelected + ", isNightMode=" + this.isNightMode + Extension.C_BRAKE;
    }
}
