package androidx.customview.widget;

import android.graphics.Rect;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.extractor.text.CueEncoder;
import app.cash.directory.data.Directory$Section;
import app.cash.directory.data.DirectoryKt;
import app.cash.directory.data.Protos_interopKt;
import app.cash.zipline.internal.bridge.InternalSerializersKt;
import app.cash.zipline.loader.LoaderAndroidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.decode.ImageSourceKt;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.ProfileDirectoryRow;
import com.squareup.protos.cash.customersearch.api.ProfileDirectoryRow$Action$HalfSheet;
import com.squareup.protos.cash.customersearch.api.ProfileDirectoryRow$Action$Url;
import com.squareup.protos.cash.customersearch.api.SearchCommonAvatarSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonCardSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$AvatarSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$CardSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$MessageSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$PlaceholderSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$RowSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$TextRowSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonTextRowItem;
import com.squareup.protos.cash.customersearch.api.TapAction;
import com.squareup.protos.cash.discover.api.app.v1.model.DisplayCriteria;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse$Content$Avatar;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse$Content$Picture;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Bullet;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.p2p.profile_directory.ui.HorizontalAlignment;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet$Content$Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet$Content$Picture;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class FocusStrategy {

    public final class SequentialComparator implements Comparator {
        public final CueEncoder mAdapter;
        public final boolean mIsLayoutRtl;
        public final Rect mTemp1 = new Rect();
        public final Rect mTemp2 = new Rect();

        public SequentialComparator(boolean z, CueEncoder cueEncoder) {
            this.mIsLayoutRtl = z;
            this.mAdapter = cueEncoder;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            this.mAdapter.getClass();
            Rect rect = this.mTemp1;
            ((AccessibilityNodeInfoCompat) obj).getBoundsInScreen(rect);
            Rect rect2 = this.mTemp2;
            ((AccessibilityNodeInfoCompat) obj2).getBoundsInScreen(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            boolean z = this.mIsLayoutRtl;
            if (i3 < i4) {
                return z ? 1 : -1;
            }
            if (i3 > i4) {
                return z ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return z ? 1 : -1;
            }
            if (i7 > i8) {
                return z ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = majorAxisDistance(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean beamBeats(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i, rect, rect2);
        if (!beamsOverlap(i, rect, rect3) && beamsOverlap) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean beamsOverlap(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.NoOperationWithQueryParameter.deepLinkSpecs;
    }

    public static boolean isCandidate(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static int majorAxisDistance(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int minorAxisDistance(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153 A[LOOP:1: B:59:0x014d->B:61:0x0153, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.squareup.protos.cash.discover.api.app.v1.model.Button] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.squareup.protos.cash.discover.api.app.v1.model.Button] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [com.squareup.protos.cash.discover.api.app.v1.model.Section$Layout] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$MessageSection] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.squareup.protos.cash.customersearch.api.SearchCommonSection$Content$PlaceholderSection] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Directory$Section transform(SearchCommonSection searchCommonSection) {
        Directory$Section.Type type2;
        Text text;
        Directory$Section directory$Section;
        ?? r5;
        Metadata metadata;
        String str;
        ?? r16;
        Section.Layout layout;
        String str2;
        ShopInfoHalfSheet shopInfoHalfSheet;
        Iterator it;
        Text text2;
        ShopInfoResponse shopInfoResponse;
        ImageSourceKt imageSourceKt;
        ImageSourceKt shopInfoResponse$Content$Avatar;
        HorizontalAlignment horizontalAlignment;
        com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment horizontalAlignment2;
        Iterator it2;
        ShopInfoHalfSheet.DisplayCriteria displayCriteria;
        DisplayCriteria displayCriteria2;
        LoaderAndroidKt loaderAndroidKt = searchCommonSection.content;
        boolean z = loaderAndroidKt instanceof SearchCommonSection$Content$RowSection;
        if (z) {
            type2 = Directory$Section.Type.ROW;
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$TextRowSection) {
            type2 = Directory$Section.Type.TEXT_ROW;
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$AvatarSection) {
            type2 = Directory$Section.Type.AVATAR;
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$CardSection) {
            type2 = Directory$Section.Type.CARD;
        } else if (loaderAndroidKt instanceof SearchCommonSection$Content$MessageSection) {
            type2 = Directory$Section.Type.MESSAGE;
        } else {
            if (!(loaderAndroidKt instanceof SearchCommonSection$Content$PlaceholderSection)) {
                if (loaderAndroidKt == null) {
                    OptionalProvider$$ExternalSyntheticLambda0.m();
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            type2 = Directory$Section.Type.PLACEHOLDER;
        }
        Directory$Section.Type type3 = type2;
        com.squareup.protos.cash.p2p.profile_directory.ui.Text text3 = searchCommonSection.section_title;
        Text compat = text3 != null ? Protos_interopKt.compat(text3) : null;
        com.squareup.protos.cash.p2p.profile_directory.ui.Text text4 = searchCommonSection.section_subtitle;
        Text compat2 = text4 != null ? Protos_interopKt.compat(text4) : null;
        if (z) {
            List list = ((SearchCommonSection$Content$RowSection) loaderAndroidKt).value.results;
            r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ProfileDirectoryRow profileDirectoryRow = (ProfileDirectoryRow) it3.next();
                profileDirectoryRow.getClass();
                String str3 = profileDirectoryRow.merchantein_token;
                Button button = profileDirectoryRow.button;
                if (str3 == null) {
                    str3 = profileDirectoryRow.token;
                }
                String str4 = str3;
                HighlightText highlightText = profileDirectoryRow.title;
                Directory$Section.Item.SimpleItem.ItemText itemText = highlightText != null ? DirectoryKt.toItemText(highlightText) : null;
                HighlightText highlightText2 = profileDirectoryRow.subtitle;
                Directory$Section.Item.SimpleItem.ItemText itemText2 = highlightText2 != null ? DirectoryKt.toItemText(highlightText2) : null;
                HighlightText highlightText3 = profileDirectoryRow.sub_child_title;
                Directory$Section.Item.SimpleItem.ItemText itemText3 = highlightText3 != null ? DirectoryKt.toItemText(highlightText3) : null;
                Avatar avatar = profileDirectoryRow.avatar;
                com.squareup.protos.cash.discover.api.app.v1.model.Avatar compat3 = avatar != null ? Protos_interopKt.compat(avatar) : null;
                Image image = profileDirectoryRow.icon;
                InternalSerializersKt internalSerializersKt = profileDirectoryRow.action;
                ProfileDirectoryRow$Action$Url profileDirectoryRow$Action$Url = internalSerializersKt instanceof ProfileDirectoryRow$Action$Url ? (ProfileDirectoryRow$Action$Url) internalSerializersKt : null;
                if (profileDirectoryRow$Action$Url == null || (str2 = profileDirectoryRow$Action$Url.value) == null) {
                    str2 = profileDirectoryRow.action_url;
                }
                String str5 = str2;
                ProfileDirectoryRow$Action$HalfSheet profileDirectoryRow$Action$HalfSheet = internalSerializersKt instanceof ProfileDirectoryRow$Action$HalfSheet ? (ProfileDirectoryRow$Action$HalfSheet) internalSerializersKt : null;
                if (profileDirectoryRow$Action$HalfSheet == null || (shopInfoHalfSheet = profileDirectoryRow$Action$HalfSheet.value) == null) {
                    shopInfoHalfSheet = button != null ? button.half_sheet : null;
                }
                if (shopInfoHalfSheet != null) {
                    zzkd zzkdVar = shopInfoHalfSheet.content;
                    if (zzkdVar instanceof ShopInfoHalfSheet$Content$Picture) {
                        shopInfoResponse$Content$Avatar = new ShopInfoResponse$Content$Picture(((ShopInfoHalfSheet$Content$Picture) zzkdVar).value);
                    } else if (zzkdVar instanceof ShopInfoHalfSheet$Content$Avatar) {
                        shopInfoResponse$Content$Avatar = new ShopInfoResponse$Content$Avatar(Protos_interopKt.compat(((ShopInfoHalfSheet$Content$Avatar) zzkdVar).value));
                    } else {
                        if (zzkdVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        imageSourceKt = null;
                        Integer num = shopInfoHalfSheet.image_max_px_height;
                        horizontalAlignment = shopInfoHalfSheet.image_horizontal_alignment;
                        if (horizontalAlignment == null) {
                            Alignment.Companion companion = com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment.Companion;
                            int i = horizontalAlignment.value;
                            companion.getClass();
                            horizontalAlignment2 = Alignment.Companion.m3859fromValue(i);
                        } else {
                            horizontalAlignment2 = null;
                        }
                        com.squareup.protos.cash.p2p.profile_directory.ui.Text text5 = shopInfoHalfSheet.title;
                        Text compat4 = text5 == null ? Protos_interopKt.compat(text5) : null;
                        com.squareup.protos.cash.p2p.profile_directory.ui.Text text6 = shopInfoHalfSheet.subtitle;
                        Text compat5 = text6 == null ? Protos_interopKt.compat(text6) : null;
                        List list2 = shopInfoHalfSheet.bullets;
                        it = it3;
                        text2 = compat;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Protos_interopKt.compat((Bullet) it2.next()));
                        }
                        Button button2 = shopInfoHalfSheet.action_button;
                        com.squareup.protos.cash.discover.api.app.v1.model.Button compat6 = button2 == null ? Protos_interopKt.compat(button2) : null;
                        com.squareup.protos.cash.p2p.profile_directory.ui.Text text7 = shopInfoHalfSheet.footer;
                        Text compat7 = text7 == null ? Protos_interopKt.compat(text7) : null;
                        displayCriteria = shopInfoHalfSheet.display_criteria;
                        if (displayCriteria == null) {
                            ImageLayout.Companion companion2 = DisplayCriteria.Companion;
                            int i2 = displayCriteria.value;
                            companion2.getClass();
                            displayCriteria2 = ImageLayout.Companion.m3845fromValue(i2);
                        } else {
                            displayCriteria2 = null;
                        }
                        shopInfoResponse = new ShopInfoResponse(imageSourceKt, num, horizontalAlignment2, compat4, compat5, arrayList, compat6, compat7, displayCriteria2, shopInfoHalfSheet.unknownFields());
                    }
                    imageSourceKt = shopInfoResponse$Content$Avatar;
                    Integer num2 = shopInfoHalfSheet.image_max_px_height;
                    horizontalAlignment = shopInfoHalfSheet.image_horizontal_alignment;
                    if (horizontalAlignment == null) {
                    }
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text52 = shopInfoHalfSheet.title;
                    if (text52 == null) {
                    }
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text62 = shopInfoHalfSheet.subtitle;
                    if (text62 == null) {
                    }
                    List list22 = shopInfoHalfSheet.bullets;
                    it = it3;
                    text2 = compat;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                    it2 = list22.iterator();
                    while (it2.hasNext()) {
                    }
                    Button button22 = shopInfoHalfSheet.action_button;
                    if (button22 == null) {
                    }
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text72 = shopInfoHalfSheet.footer;
                    if (text72 == null) {
                    }
                    displayCriteria = shopInfoHalfSheet.display_criteria;
                    if (displayCriteria == null) {
                    }
                    shopInfoResponse = new ShopInfoResponse(imageSourceKt, num2, horizontalAlignment2, compat4, compat5, arrayList2, compat6, compat7, displayCriteria2, shopInfoHalfSheet.unknownFields());
                } else {
                    it = it3;
                    text2 = compat;
                    shopInfoResponse = null;
                }
                r5.add(new Directory$Section.Item.SimpleItem(str4, itemText, itemText2, itemText3, compat3, image, str5, button != null ? Protos_interopKt.compat(button) : null, profileDirectoryRow.metadata, shopInfoResponse, profileDirectoryRow.account_holder_token, 12816));
                it3 = it;
                compat = text2;
            }
            text = compat;
            directory$Section = null;
        } else {
            text = compat;
            directory$Section = null;
            if (loaderAndroidKt instanceof SearchCommonSection$Content$TextRowSection) {
                List<SearchCommonTextRowItem> list3 = ((SearchCommonSection$Content$TextRowSection) loaderAndroidKt).value.results;
                r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (SearchCommonTextRowItem searchCommonTextRowItem : list3) {
                    HighlightText highlightText4 = searchCommonTextRowItem.text;
                    Directory$Section.Item.SimpleItem.ItemText itemText4 = highlightText4 != null ? DirectoryKt.toItemText(highlightText4) : null;
                    Image image2 = searchCommonTextRowItem.icon;
                    String str6 = searchCommonTextRowItem.action_url;
                    SearchCommonTextRowItem.Metadata metadata2 = searchCommonTextRowItem.metadata;
                    if (metadata2 == null || (str = metadata2.search_text) == null) {
                        metadata = null;
                    } else {
                        EmptyList emptyList = EmptyList.INSTANCE;
                        metadata = new Metadata(null, null, null, emptyList, str, null, null, null, null, emptyList, null, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY);
                    }
                    r5.add(new Directory$Section.Item.SimpleItem(null, itemText4, null, null, null, image2, str6, null, metadata, null, null, 31549));
                }
            } else if (loaderAndroidKt instanceof SearchCommonSection$Content$AvatarSection) {
                List<SearchCommonAvatarSection.SearchCommonAvatarItem> list4 = ((SearchCommonSection$Content$AvatarSection) loaderAndroidKt).value.items;
                r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (SearchCommonAvatarSection.SearchCommonAvatarItem searchCommonAvatarItem : list4) {
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text8 = searchCommonAvatarItem.title;
                    Directory$Section.Item.SimpleItem.ItemText itemText5 = text8 != null ? DirectoryKt.toItemText(Protos_interopKt.compat(text8)) : null;
                    Avatar avatar2 = searchCommonAvatarItem.avatar;
                    r5.add(new Directory$Section.Item.SimpleItem(null, itemText5, null, null, avatar2 != null ? Protos_interopKt.compat(avatar2) : null, null, null, null, searchCommonAvatarItem.metadata, null, null, 31709));
                }
            } else if (loaderAndroidKt instanceof SearchCommonSection$Content$CardSection) {
                List<SearchCommonCardSection.SearchCommonCardItem> list5 = ((SearchCommonSection$Content$CardSection) loaderAndroidKt).value.items;
                r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (SearchCommonCardSection.SearchCommonCardItem searchCommonCardItem : list5) {
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text9 = searchCommonCardItem.primary_text;
                    Directory$Section.Item.SimpleItem.ItemText itemText6 = text9 != null ? DirectoryKt.toItemText(Protos_interopKt.compat(text9)) : null;
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text10 = searchCommonCardItem.secondary_text;
                    Directory$Section.Item.SimpleItem.ItemText itemText7 = text10 != null ? DirectoryKt.toItemText(Protos_interopKt.compat(text10)) : null;
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text11 = searchCommonCardItem.tertiary_left_text;
                    Directory$Section.Item.SimpleItem.ItemText itemText8 = text11 != null ? DirectoryKt.toItemText(Protos_interopKt.compat(text11)) : null;
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text12 = searchCommonCardItem.tertiary_right_text;
                    r5.add(new Directory$Section.Item.CardItem(itemText6, itemText7, itemText8, text12 != null ? DirectoryKt.toItemText(Protos_interopKt.compat(text12)) : null, searchCommonCardItem.metadata, searchCommonCardItem.picture, searchCommonCardItem.item_action_url));
                }
            } else {
                if (!(loaderAndroidKt instanceof SearchCommonSection$Content$MessageSection) && !(loaderAndroidKt instanceof SearchCommonSection$Content$PlaceholderSection)) {
                    if (loaderAndroidKt == null) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                r5 = EmptyList.INSTANCE;
            }
        }
        List list6 = r5;
        ?? r2 = loaderAndroidKt instanceof SearchCommonSection$Content$PlaceholderSection ? (SearchCommonSection$Content$PlaceholderSection) loaderAndroidKt : directory$Section;
        ?? r13 = r2 != 0 ? r2.value : directory$Section;
        ?? r1 = loaderAndroidKt instanceof SearchCommonSection$Content$MessageSection ? (SearchCommonSection$Content$MessageSection) loaderAndroidKt : directory$Section;
        ?? r14 = r1 != 0 ? r1.value : directory$Section;
        ?? valueOf = searchCommonSection.default_max_items != null ? Long.valueOf(r1.intValue()) : directory$Section;
        TapAction tapAction = searchCommonSection.tap_action;
        ?? r10 = tapAction != null ? tapAction.action_url : directory$Section;
        Button button3 = searchCommonSection.section_action_button;
        ?? compat8 = button3 != null ? Protos_interopKt.compat(button3) : directory$Section;
        Button button4 = searchCommonSection.section_footer_action_button;
        ?? compat9 = button4 != null ? Protos_interopKt.compat(button4) : directory$Section;
        SearchCommonSection.Layout layout2 = searchCommonSection.layout;
        if (layout2 != null) {
            switch (layout2.ordinal()) {
                case 0:
                    layout = Section.Layout.ONE_ROW;
                    break;
                case 1:
                    layout = Section.Layout.ONE_COLUMN;
                    break;
                case 2:
                    layout = Section.Layout.TWO_ROWS;
                    break;
                case 3:
                    layout = Section.Layout.TWO_COLUMNS;
                    break;
                case 4:
                    layout = Section.Layout.THREE_ROWS;
                    break;
                case 5:
                    layout = Section.Layout.THREE_COLUMNS;
                    break;
                case 6:
                    layout = Section.Layout.FOUR_ROWS;
                    break;
                case 7:
                    layout = Section.Layout.FOUR_COLUMNS;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return directory$Section;
            }
            r16 = layout;
        } else {
            r16 = directory$Section;
        }
        return new Directory$Section(text, compat2, list6, type3, r10, compat8, compat9, r13, r14, valueOf, r16, 3750022);
    }
}
