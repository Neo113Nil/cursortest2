package app.cash.local.views.internal.dropdown;

import androidx.compose.ui.graphics.Color;
import com.squareup.cash.arcade.Icons;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalDropdownItemModel {
    public final IconState iconState;
    public final Function0 onClick;
    public final String text;
    public final Color textColorOverride;

    public interface ClickResult {

        public final class CloseMenu implements ClickResult {
            public static final CloseMenu INSTANCE = new CloseMenu();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseMenu);
            }

            public final int hashCode() {
                return -44290473;
            }

            public final String toString() {
                return "CloseMenu";
            }
        }

        public final class KeepMenuOpen implements ClickResult {
            public static final KeepMenuOpen INSTANCE = new KeepMenuOpen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof KeepMenuOpen);
            }

            public final int hashCode() {
                return -167955442;
            }

            public final String toString() {
                return "KeepMenuOpen";
            }
        }
    }

    public LocalDropdownItemModel(String str, Color color, IconState iconState, Function0 function0) {
        str.getClass();
        iconState.getClass();
        function0.getClass();
        this.text = str;
        this.textColorOverride = color;
        this.iconState = iconState;
        this.onClick = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDropdownItemModel)) {
            return false;
        }
        LocalDropdownItemModel localDropdownItemModel = (LocalDropdownItemModel) obj;
        return Intrinsics.areEqual(this.text, localDropdownItemModel.text) && Intrinsics.areEqual(this.textColorOverride, localDropdownItemModel.textColorOverride) && Intrinsics.areEqual(this.iconState, localDropdownItemModel.iconState) && Intrinsics.areEqual(this.onClick, localDropdownItemModel.onClick);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.text.hashCode() * 31;
        Color color = this.textColorOverride;
        if (color == null) {
            hashCode = 0;
        } else {
            long j = color.value;
            ULong.Companion companion = ULong.Companion;
            hashCode = Long.hashCode(j);
        }
        return this.onClick.hashCode() + ((this.iconState.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "LocalDropdownItemModel(text=" + this.text + ", textColorOverride=" + this.textColorOverride + ", iconState=" + this.iconState + ", onClick=" + this.onClick + ")";
    }

    public interface IconState {

        public final class Loading implements IconState {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1559406801;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class NoIcon implements IconState {
            public static final NoIcon INSTANCE = new NoIcon();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoIcon);
            }

            public final int hashCode() {
                return 560428423;
            }

            public final String toString() {
                return "NoIcon";
            }
        }

        public final class WithIcon implements IconState {
            public final Icons icon;
            public final Color iconColorOverride;

            public WithIcon(Icons icons) {
                this.icon = icons;
                this.iconColorOverride = null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WithIcon)) {
                    return false;
                }
                WithIcon withIcon = (WithIcon) obj;
                return this.icon == withIcon.icon && Intrinsics.areEqual(this.iconColorOverride, withIcon.iconColorOverride);
            }

            public final int hashCode() {
                int hashCode;
                int hashCode2 = this.icon.hashCode() * 31;
                Color color = this.iconColorOverride;
                if (color == null) {
                    hashCode = 0;
                } else {
                    long j = color.value;
                    ULong.Companion companion = ULong.Companion;
                    hashCode = Long.hashCode(j);
                }
                return hashCode2 + hashCode;
            }

            public final String toString() {
                return "WithIcon(icon=" + this.icon + ", iconColorOverride=" + this.iconColorOverride + ")";
            }

            public WithIcon(Icons icons, Color color) {
                this.icon = icons;
                this.iconColorOverride = color;
            }
        }
    }

    public /* synthetic */ LocalDropdownItemModel(String str, IconState iconState, Function0 function0, int i) {
        this(str, (Color) null, (i & 4) != 0 ? IconState.NoIcon.INSTANCE : iconState, function0);
    }
}
