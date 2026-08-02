package app.cash.directory.data;

import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import coil3.decode.ImageSource;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.discover.api.app.v1.model.Avatar;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.DisplayCriteria;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Bullet;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button$Content$Icon;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button$Content$Text;
import com.squareup.protos.cash.p2p.profile_directory.ui.HorizontalAlignment;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet$Content$Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet$Content$Picture;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class Protos_interopKt {
    public static final CardSchemeViewModel.Module.HeroPaymentDevices access$heroPaymentDevices(CardSchemeViewModel cardSchemeViewModel) {
        List list;
        CardSchemeViewModel.Content content = cardSchemeViewModel instanceof CardSchemeViewModel.Content ? (CardSchemeViewModel.Content) cardSchemeViewModel : null;
        if (content == null || (list = content.modules) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CardSchemeViewModel.Module.HeroPaymentDevices) {
                arrayList.add(obj);
            }
        }
        return (CardSchemeViewModel.Module.HeroPaymentDevices) CollectionsKt.firstOrNull((List) arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[LOOP:0: B:20:0x0082->B:22:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Button compat(com.squareup.protos.cash.p2p.profile_directory.ui.Button button) {
        Button.ButtonAction buttonAction;
        ShopInfoHalfSheet shopInfoHalfSheet;
        FetcherKt fetcherKt;
        Button.ButtonStyle buttonStyle;
        ImageSource.Metadata metadata;
        ImageSource.Metadata shopInfoHalfSheet$Content$Picture;
        HorizontalAlignment horizontalAlignment;
        com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment horizontalAlignment2;
        Iterator it;
        ShopInfoHalfSheet.DisplayCriteria displayCriteria;
        DisplayCriteria displayCriteria2;
        button.getClass();
        Button.ButtonAction buttonAction2 = button.action_type;
        Button.ButtonSize buttonSize = null;
        if (buttonAction2 != null) {
            Action.Type.Companion companion = Button.ButtonAction.Companion;
            int i = buttonAction2.value;
            companion.getClass();
            buttonAction = Action.Type.Companion.m3864fromValue(i);
        } else {
            buttonAction = null;
        }
        String str = button.action_url;
        com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet shopInfoHalfSheet2 = button.half_sheet;
        if (shopInfoHalfSheet2 != null) {
            zzkd zzkdVar = shopInfoHalfSheet2.content;
            if (zzkdVar instanceof ShopInfoHalfSheet$Content$Avatar) {
                shopInfoHalfSheet$Content$Picture = new com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet$Content$Avatar(compat(((ShopInfoHalfSheet$Content$Avatar) zzkdVar).value));
            } else if (zzkdVar instanceof ShopInfoHalfSheet$Content$Picture) {
                shopInfoHalfSheet$Content$Picture = new com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet$Content$Picture(((ShopInfoHalfSheet$Content$Picture) zzkdVar).value);
            } else {
                if (zzkdVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                metadata = null;
                Integer num = shopInfoHalfSheet2.image_max_px_height;
                horizontalAlignment = shopInfoHalfSheet2.image_horizontal_alignment;
                if (horizontalAlignment == null) {
                    Alignment.Companion companion2 = com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment.Companion;
                    int i2 = horizontalAlignment.value;
                    companion2.getClass();
                    horizontalAlignment2 = Alignment.Companion.m3859fromValue(i2);
                } else {
                    horizontalAlignment2 = null;
                }
                Text text = shopInfoHalfSheet2.title;
                com.squareup.protos.cash.discover.api.app.v1.model.Text compat = text == null ? compat(text) : null;
                Text text2 = shopInfoHalfSheet2.subtitle;
                com.squareup.protos.cash.discover.api.app.v1.model.Text compat2 = text2 == null ? compat(text2) : null;
                List list = shopInfoHalfSheet2.bullets;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(compat((Bullet) it.next()));
                }
                com.squareup.protos.cash.p2p.profile_directory.ui.Button button2 = shopInfoHalfSheet2.action_button;
                com.squareup.protos.cash.discover.api.app.v1.model.Button compat3 = button2 == null ? compat(button2) : null;
                Text text3 = shopInfoHalfSheet2.footer;
                com.squareup.protos.cash.discover.api.app.v1.model.Text compat4 = text3 == null ? compat(text3) : null;
                displayCriteria = shopInfoHalfSheet2.display_criteria;
                if (displayCriteria == null) {
                    ImageLayout.Companion companion3 = DisplayCriteria.Companion;
                    int i3 = displayCriteria.value;
                    companion3.getClass();
                    displayCriteria2 = ImageLayout.Companion.m3845fromValue(i3);
                } else {
                    displayCriteria2 = null;
                }
                shopInfoHalfSheet = new com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet(metadata, num, horizontalAlignment2, compat, compat2, arrayList, compat3, compat4, displayCriteria2, shopInfoHalfSheet2.unknownFields());
            }
            metadata = shopInfoHalfSheet$Content$Picture;
            Integer num2 = shopInfoHalfSheet2.image_max_px_height;
            horizontalAlignment = shopInfoHalfSheet2.image_horizontal_alignment;
            if (horizontalAlignment == null) {
            }
            Text text4 = shopInfoHalfSheet2.title;
            if (text4 == null) {
            }
            Text text22 = shopInfoHalfSheet2.subtitle;
            if (text22 == null) {
            }
            List list2 = shopInfoHalfSheet2.bullets;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            com.squareup.protos.cash.p2p.profile_directory.ui.Button button22 = shopInfoHalfSheet2.action_button;
            if (button22 == null) {
            }
            Text text32 = shopInfoHalfSheet2.footer;
            if (text32 == null) {
            }
            displayCriteria = shopInfoHalfSheet2.display_criteria;
            if (displayCriteria == null) {
            }
            shopInfoHalfSheet = new com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoHalfSheet(metadata, num2, horizontalAlignment2, compat, compat2, arrayList2, compat3, compat4, displayCriteria2, shopInfoHalfSheet2.unknownFields());
        } else {
            shopInfoHalfSheet = null;
        }
        Button.ButtonAction buttonAction3 = buttonAction;
        Color color = button.background_color;
        ErrorEvent.Companion companion4 = button.content;
        if (companion4 instanceof Button$Content$Icon) {
            fetcherKt = new com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Icon(((Button$Content$Icon) companion4).value);
        } else if (companion4 instanceof Button$Content$Text) {
            fetcherKt = new com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text(((Button$Content$Text) companion4).value);
        } else {
            if (companion4 != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            fetcherKt = null;
        }
        Button.ButtonStyle buttonStyle2 = button.button_style;
        if (buttonStyle2 != null) {
            Channel.Companion companion5 = Button.ButtonStyle.Companion;
            int i4 = buttonStyle2.value;
            companion5.getClass();
            buttonStyle = Channel.Companion.m3871fromValue(i4);
        } else {
            buttonStyle = null;
        }
        Button.ButtonSize buttonSize2 = button.button_size;
        if (buttonSize2 != null) {
            Alignment.Companion companion6 = Button.ButtonSize.Companion;
            int i5 = buttonSize2.value;
            companion6.getClass();
            if (i5 == 1) {
                buttonSize = Button.ButtonSize.SMALL;
            } else if (i5 == 2) {
                buttonSize = Button.ButtonSize.LARGE;
            }
        }
        return new com.squareup.protos.cash.discover.api.app.v1.model.Button(buttonAction3, str, shopInfoHalfSheet, color, fetcherKt, buttonStyle, buttonSize, button.unknownFields());
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowFirstTimeFlowDeprecated.deepLinkSpecs;
    }

    public static final Avatar compat(com.squareup.protos.cash.p2p.profile_directory.ui.Avatar avatar) {
        avatar.getClass();
        Avatar.Initials initials = avatar.initials;
        return new com.squareup.protos.cash.discover.api.app.v1.model.Avatar(initials != null ? new Avatar.Initials(initials.initials, initials.text_color, initials.background_color, initials.unknownFields()) : null, avatar.picture, avatar.icon, avatar.action_url, avatar.unknownFields());
    }

    public static final com.squareup.protos.cash.discover.api.app.v1.model.Text compat(Text text) {
        TextStyle textStyle;
        text.getClass();
        String str = text.text;
        com.squareup.protos.cash.p2p.profile_directory.ui.TextStyle textStyle2 = text.text_style;
        TextDecoration textDecoration = null;
        if (textStyle2 != null) {
            ImageLayout.Companion companion = TextStyle.Companion;
            int i = textStyle2.value;
            companion.getClass();
            textStyle = ImageLayout.Companion.m3846fromValue(i);
        } else {
            textStyle = null;
        }
        com.squareup.protos.cash.p2p.profile_directory.ui.TextDecoration textDecoration2 = text.text_decoration;
        if (textDecoration2 != null) {
            RadioType.Companion companion2 = TextDecoration.Companion;
            int i2 = textDecoration2.value;
            companion2.getClass();
            if (i2 == 1) {
                textDecoration = TextDecoration.STRIKETHROUGH;
            } else if (i2 == 2) {
                textDecoration = TextDecoration.UNDERLINE;
            }
        }
        return new com.squareup.protos.cash.discover.api.app.v1.model.Text(str, textStyle, textDecoration, text.text_color, text.icon, text.unknownFields());
    }

    public static final com.squareup.protos.cash.discover.api.app.v1.model.Bullet compat(Bullet bullet) {
        bullet.getClass();
        Image image = bullet.bullet_icon;
        Text text = bullet.bullet_title;
        com.squareup.protos.cash.discover.api.app.v1.model.Text compat = text != null ? compat(text) : null;
        Text text2 = bullet.bullet_body;
        return new com.squareup.protos.cash.discover.api.app.v1.model.Bullet(image, compat, text2 != null ? compat(text2) : null, bullet.unknownFields());
    }
}
