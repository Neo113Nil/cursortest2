package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletInfoSheetViewModel implements AfterpayAppletItemViewed {
    public final List analyticsDismissEvent;
    public final UiAvatar avatar;
    public final Button ctaButton;
    public final List impressionEvent;
    public final String subtitle;
    public final List textContent;
    public final String title;

    public interface TextContentItem {

        public final class BulletList implements TextContentItem {
            public final List items;

            public BulletList(List list) {
                list.getClass();
                this.items = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BulletList) && Intrinsics.areEqual(this.items, ((BulletList) obj).items);
            }

            public final int hashCode() {
                return this.items.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("BulletList(items=", ")", this.items);
            }
        }

        public final class NumberedList implements TextContentItem {
            public final List items;

            public final class NumberedItem {
                public final String subtitle;
                public final String title;

                public NumberedItem(String str, String str2) {
                    str.getClass();
                    this.title = str;
                    this.subtitle = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NumberedItem)) {
                        return false;
                    }
                    NumberedItem numberedItem = (NumberedItem) obj;
                    return Intrinsics.areEqual(this.title, numberedItem.title) && Intrinsics.areEqual(this.subtitle, numberedItem.subtitle);
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("NumberedItem(title=", this.title, ", subtitle=", this.subtitle, ")");
                }
            }

            public NumberedList(List list) {
                list.getClass();
                this.items = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NumberedList) && Intrinsics.areEqual(this.items, ((NumberedList) obj).items);
            }

            public final int hashCode() {
                return this.items.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("NumberedList(items=", ")", this.items);
            }
        }

        public final class TextLine implements TextContentItem {
            public final String text;

            public TextLine(String str) {
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TextLine) && this.text.equals(((TextLine) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextLine(text=", this.text, ")");
            }
        }
    }

    public AfterpayAppletInfoSheetViewModel(String str, String str2, ArrayList arrayList, Button button, List list, List list2, UiAvatar uiAvatar) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.textContent = arrayList;
        this.ctaButton = button;
        this.impressionEvent = list;
        this.analyticsDismissEvent = list2;
        this.avatar = uiAvatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletInfoSheetViewModel)) {
            return false;
        }
        AfterpayAppletInfoSheetViewModel afterpayAppletInfoSheetViewModel = (AfterpayAppletInfoSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, afterpayAppletInfoSheetViewModel.title) && Intrinsics.areEqual(this.subtitle, afterpayAppletInfoSheetViewModel.subtitle) && Intrinsics.areEqual(this.textContent, afterpayAppletInfoSheetViewModel.textContent) && Intrinsics.areEqual(this.ctaButton, afterpayAppletInfoSheetViewModel.ctaButton) && Intrinsics.areEqual(this.impressionEvent, afterpayAppletInfoSheetViewModel.impressionEvent) && Intrinsics.areEqual(this.analyticsDismissEvent, afterpayAppletInfoSheetViewModel.analyticsDismissEvent) && Intrinsics.areEqual(this.avatar, afterpayAppletInfoSheetViewModel.avatar);
    }

    @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
    public final List getImpressionEvent() {
        return this.impressionEvent;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.textContent;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Button button = this.ctaButton;
        int hashCode4 = (hashCode3 + (button == null ? 0 : button.hashCode())) * 31;
        List list2 = this.impressionEvent;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.analyticsDismissEvent;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        UiAvatar uiAvatar = this.avatar;
        return hashCode6 + (uiAvatar != null ? uiAvatar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletInfoSheetViewModel(title=", this.title, ", subtitle=", this.subtitle, ", textContent=");
        m.append(this.textContent);
        m.append(", ctaButton=");
        m.append(this.ctaButton);
        m.append(", impressionEvent=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.impressionEvent, ", analyticsDismissEvent=", this.analyticsDismissEvent, ", avatar=");
        m.append(this.avatar);
        m.append(")");
        return m.toString();
    }
}
