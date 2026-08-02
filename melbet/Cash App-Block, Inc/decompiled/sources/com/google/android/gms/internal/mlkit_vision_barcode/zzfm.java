package com.google.android.gms.internal.mlkit_vision_barcode;

import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.db.ImageType;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewed;
import com.squareup.cash.shopping.presenters.RecentSearchExtensionsKt$WhenMappings;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public abstract class zzfm {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.PreauthedCompleteScenario.deepLinkSpecs;
    }

    public static Set getExclusions() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final void save(RealRecentSearchManager realRecentSearchManager, DirectoryListItem.ItemViewModel itemViewModel, AndroidClock androidClock) {
        Image image;
        String str;
        Metadata.EntityType entityType;
        Text text;
        Text text2;
        itemViewModel.getClass();
        DirectoryAnalyticsData directoryAnalyticsData = itemViewModel.analyticsData;
        AvatarViewModel avatarViewModel = itemViewModel.avatar;
        DirectoryAnalyticsData.EntityType entityType2 = directoryAnalyticsData.entityType;
        Continuation continuation = null;
        switch (entityType2 == null ? -1 : RecentSearchExtensionsKt$WhenMappings.$EnumSwitchMapping$0[entityType2.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (avatarViewModel != null) {
                    image = GrpcStatus.Companion.getImage(avatarViewModel);
                    break;
                }
            case 0:
            default:
                image = null;
                break;
            case 7:
                image = itemViewModel.picture;
                break;
        }
        String str2 = directoryAnalyticsData.item.entityToken;
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        DirectoryListItem.ItemViewModel.Text text3 = itemViewModel.title;
        String str3 = (text3 == null || (text2 = text3.text) == null) ? null : text2.text;
        String str4 = image != null ? image.light_url : null;
        String str5 = image != null ? image.dark_url : null;
        if (avatarViewModel == null || (str = avatarViewModel.actionUrl) == null) {
            str = itemViewModel.itemActionUrl;
        }
        String str6 = str;
        ColorModel colorModel = avatarViewModel != null ? avatarViewModel.accentColor : null;
        ColorModel.Accented accented = colorModel instanceof ColorModel.Accented ? (ColorModel.Accented) colorModel : null;
        Color color = accented != null ? accented.color : null;
        long millis = androidClock.millis();
        DirectoryListItem.ItemViewModel.Text text4 = itemViewModel.subtitle;
        String str7 = (text4 == null || (text = text4.text) == null) ? null : text.text;
        DirectoryAnalyticsData.EntityType entityType3 = directoryAnalyticsData.entityType;
        if (entityType3 != null) {
            switch (entityType3.ordinal()) {
                case 0:
                    entityType = Metadata.EntityType.CUSTOMER;
                    break;
                case 1:
                    entityType = Metadata.EntityType.BUSINESS;
                    break;
                case 2:
                    entityType = Metadata.EntityType.AP_STORE;
                    break;
                case 3:
                    entityType = Metadata.EntityType.CASH_AFTERPAY;
                    break;
                case 4:
                    entityType = Metadata.EntityType.BOOST_MERCHANT;
                    break;
                case 5:
                    entityType = Metadata.EntityType.PRODUCT;
                    break;
                case 6:
                    entityType = Metadata.EntityType.SQ_MERCHANT;
                    break;
                case 7:
                    entityType = Metadata.EntityType.APP_FEATURE;
                    break;
                case 8:
                    entityType = Metadata.EntityType.STOCK;
                    break;
                case 9:
                    entityType = Metadata.EntityType.OFFER;
                    break;
                case 10:
                    entityType = Metadata.EntityType.CAP;
                    break;
                case 11:
                    entityType = Metadata.EntityType.LOCAL_BRAND;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
        } else {
            entityType = Metadata.EntityType.UNKNOWN;
        }
        JobKt.launch$default(realRecentSearchManager.scope, realRecentSearchManager.ioDispatcher, null, new ProfileCropView.AnonymousClass3(realRecentSearchManager, new ShoppingRecentlyViewed(str2, str3, str4, str5, str6, millis, color, str7, entityType, avatarViewModel != null ? ImageType.AVATAR : ImageType.CARD), continuation, 19), 2);
    }
}
