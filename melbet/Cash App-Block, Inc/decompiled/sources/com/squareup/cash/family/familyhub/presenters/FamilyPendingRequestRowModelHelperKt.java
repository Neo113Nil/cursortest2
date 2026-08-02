package com.squareup.cash.family.familyhub.presenters;

import androidx.compose.ui.draw.RotateKt;
import app.cash.arcade.values.Color;
import app.cash.mooncake.values.MooncakeColors;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.aegis.core.PendingRequest;
import com.squareup.protos.cash.aegis.core.ViewRequestLink;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.MoshiJsonIntegration;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public abstract class FamilyPendingRequestRowModelHelperKt {
    public static final StackedAvatarViewModel.Avatar DEFAULT_AVATAR;
    public static final StackedAvatarViewModel.Avatar LOADING_AVATAR;

    static {
        Color.Id id = MooncakeColors.secondaryButtonBackground;
        LOADING_AVATAR = new StackedAvatarViewModel.Avatar(MoshiJsonIntegration.toModel$default(id), ' ', null, null, null, null, null, null, false, false, null, false, null, null, 131068);
        ColorModel model$default = MoshiJsonIntegration.toModel$default(id);
        zzd zzdVar = Icons.Companion;
        DEFAULT_AVATAR = new StackedAvatarViewModel.Avatar(model$default, null, null, null, null, new Icon("bdH0Yu"), null, null, false, false, null, false, null, null, 131038);
    }

    public static final FamilyPendingRequestRowModel.Loaded toModel(HasObservability hasObservability, PendingRequest pendingRequest, Map map) {
        Pair pair;
        String str;
        pendingRequest.getClass();
        map.getClass();
        String str2 = pendingRequest.title;
        StackedAvatarViewModel.Avatar avatar = DEFAULT_AVATAR;
        if (str2 != null) {
            pair = new Pair(avatar, str2);
        } else {
            String str3 = pendingRequest.requester_customer_token;
            if (str3 != null) {
                Recipient recipient = (Recipient) map.get(str3);
                if (recipient != null) {
                    avatar = GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(recipient));
                }
                pair = new Pair(avatar, recipient != null ? recipient.fullName : null);
            } else {
                pair = new Pair(LOADING_AVATAR, null);
            }
        }
        StackedAvatarViewModel.Avatar avatar2 = (StackedAvatarViewModel.Avatar) pair.first;
        String str4 = (String) pair.second;
        FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(pendingRequest, familyParsingErrorFactory, hasObservability);
            ViewRequestLink viewRequestLink = (ViewRequestLink) protoValidationScope.reportIfNullAndContinue("request_action_link", (String) null, pendingRequest.request_action_link);
            if (viewRequestLink != null) {
                String str5 = pendingRequest.subtitle;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5;
                String str7 = (String) protoValidationScope.reportIfNullAndContinue("request_action_link.text", (String) null, viewRequestLink.text);
                if (str7 != null && (str = (String) protoValidationScope.reportIfNullAndContinue("request_action_link.url", (String) null, viewRequestLink.url)) != null) {
                    return new FamilyPendingRequestRowModel.Loaded(avatar2, str4, str6, str7, str, pendingRequest.requester_customer_token);
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(PendingRequest.class), familyParsingErrorFactory, null);
        }
    }
}
