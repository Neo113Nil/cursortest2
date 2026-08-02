package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.core.os.BundleKt;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalPresenterFactoryKt;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.filament.Box;
import com.google.android.filament.Camera;
import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.android.TextureHelper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.miteksystems.misnap.camera.a.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.blockers.presenters.EarnerUpsellBlockerPresenter;
import com.squareup.cash.blockers.presenters.PromotionPanePresenter;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.blockers.presenters.RequestPushNotificationsBlockerPresenter;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$models$2$1$2;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge;
import com.squareup.cash.boost.backend.BoostConfigManager;
import com.squareup.cash.boost.backend.RealBoostConfigManager;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.braze.BrazeSetupTeardownActivityWorker;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.braze.RealBrazeManager$openSession$1$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.core.ContouredMarquee;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter;
import com.squareup.cash.cashapplite.screens.PasskeySignatureBlockerScreen;
import com.squareup.cash.cashapppay.presenters.StatusInterstitialPresenter;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientrouting.routers.investing.InvestingRouter;
import com.squareup.cash.clientrouting.routers.local.LocalRouter;
import com.squareup.cash.common.composeui.animations.ArcadeShaker;
import com.squareup.cash.common.composeui.animations.RegularShaker;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.composeUi.foundation.text.PressGestureScopeImpl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import com.squareup.cash.data.contacts.RealContactSyncEventAggregator;
import com.squareup.cash.data.contacts.RealContactSyncRoutineAggregator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.earnings.backend.real.EarningsHomeUiChartState;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileLocalTabVisibility;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.cash.filament.util.Mesh;
import com.squareup.cash.filament.util.MeshLoaderKt;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.contacts.ContactBook$ContactAccountDetailsQuery;
import com.squareup.cash.integration.contacts.ContactBook$DetailedContactQuery;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.db.OffersSearch;
import com.squareup.cash.paymentpad.presenters.FxExchangeRates;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.session.backend.SessionManagerKt$special$$inlined$filterIsInstance$1;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.sharesheet.ShareableAssetsManager$DownloadedImage;
import com.squareup.cash.sharesheet.ShareableAssetsManager$ShareableAssets;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider;
import com.squareup.cash.transactionpicker.presenters.PagedTransactions;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$6$1$2$2$1;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.paging.PagingDataWithCount;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.fiatly.syncvalues.P2PControl;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetBoostConfigRequest;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.PaymentMethod;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.protos.franklin.common.ExchangeRate;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.lending.EntryPointTappedRequest;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.rewardly.app.RewardlyExternalAppService;
import com.squareup.util.Quadruple;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.misnap.iad.IadFrame;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import squareup.cash.earnings.EarningsHomeUIState;
import timber.log.Timber;

/* loaded from: classes6.dex */
public class CardModelView extends BaseModelView {
    public static final Quat CARD_CAMERA_ROTATION;
    public static final Quat DEFAULT_CARD_ROTATION;
    public static final int DEFAULT_MAG_BACK_COLOR;
    public static final Vector4 LEFT_EYE_OFFSET;
    public static final Vector4 PERPENDICULAR_CARD_DIRECTION;
    public static final Paint REMOVE_PAINT;
    public static final Vector4 RIGHT_EYE_OFFSET;
    public final ParcelableSnapshotMutableState _isFacingForward$delegate;
    public boolean cardInitialized;
    public Quat cardRotation;
    public float cardScale;
    public float[] cardTranslation;
    public CardModelView$1$3$4$2 childEntityFactory;
    public Mesh contouredTextMesh;
    public Material copyMaterial;
    public final StateFlowImpl customizationOverride;
    public final BufferedChannel engineAttachedEvent;
    public float eyeIntensity;
    public final StateFlowImpl iconTextureRelay;
    public int indicatorColor;
    public float indicatorRadius;
    public Pair indirectLightEntities;
    public Integer leftEye;
    public final ArrayList loadedChildren;
    public Material material;
    public MaterialInstance materialInstance;
    public MaterialInstance materialInstanceBack;
    public Mesh mesh;
    public Mesh meshBack;
    public final Lazy moodHandMask$delegate;
    public final Lazy moodSkin$delegate;
    public Function0 onError;
    public Integer rightEye;
    public final TextureSampler sampler;
    public final TextureSampler shimmerSampler;
    public Pair skyboxEntities;
    public MaterialInstance textMaterialInstance;
    public CardTextureState textureState;
    public final SharedFlowImpl touchPoints;
    public final StateFlowImpl viewmodels;

    public final class CardBack {
        public final String cardCVV;
        public final String cardExpiration;
        public final String cardHolderName;
        public final String cardNumber;
        public final CardTheme.Font font;
        public final PaymentMethod paymentMethod;
        public final boolean withRealCard;

        public CardBack(String str, String str2, String str3, String str4, CardTheme.Font font, PaymentMethod paymentMethod, boolean z) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.cardHolderName = str;
            this.cardNumber = str2;
            this.cardCVV = str3;
            this.cardExpiration = str4;
            this.font = font;
            this.paymentMethod = paymentMethod;
            this.withRealCard = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardBack)) {
                return false;
            }
            CardBack cardBack = (CardBack) obj;
            return Intrinsics.areEqual(this.cardHolderName, cardBack.cardHolderName) && Intrinsics.areEqual(this.cardNumber, cardBack.cardNumber) && Intrinsics.areEqual(this.cardCVV, cardBack.cardCVV) && Intrinsics.areEqual(this.cardExpiration, cardBack.cardExpiration) && this.font == cardBack.font && this.paymentMethod == cardBack.paymentMethod && this.withRealCard == cardBack.withRealCard;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cardHolderName.hashCode() * 31, 31, this.cardNumber), 31, this.cardCVV), 31, this.cardExpiration);
            CardTheme.Font font = this.font;
            int hashCode = (m + (font == null ? 0 : font.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            return Boolean.hashCode(this.withRealCard) + ((hashCode + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardBack(cardHolderName=", this.cardHolderName, ", cardNumber=", this.cardNumber, ", cardCVV=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.cardCVV, ", cardExpiration=", this.cardExpiration, ", font=");
            m.append(this.font);
            m.append(", paymentMethod=");
            m.append(this.paymentMethod);
            m.append(", withRealCard=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.withRealCard, ")");
        }
    }

    public final class CardFront {
        public final CardTheme.BackgroundImage backgroundImage;
        public final String cashtag;
        public final CustomizationDetails customizationDetails;
        public final CardTheme.CardCustomizationMargin customizationMargin;
        public final EquatableBitmap customizationOverride;
        public final CardTheme.Font font;
        public final CardTheme.Identifier id;

        public CardFront(String str, CustomizationDetails customizationDetails, CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, CardTheme.CardCustomizationMargin cardCustomizationMargin, CardTheme.Font font, EquatableBitmap equatableBitmap) {
            this.cashtag = str;
            this.customizationDetails = customizationDetails;
            this.id = identifier;
            this.backgroundImage = backgroundImage;
            this.customizationMargin = cardCustomizationMargin;
            this.font = font;
            this.customizationOverride = equatableBitmap;
        }

        public static CardFront copy$default(CardFront cardFront, EquatableBitmap equatableBitmap) {
            String str = cardFront.cashtag;
            CustomizationDetails customizationDetails = cardFront.customizationDetails;
            CardTheme.Identifier identifier = cardFront.id;
            CardTheme.BackgroundImage backgroundImage = cardFront.backgroundImage;
            CardTheme.CardCustomizationMargin cardCustomizationMargin = cardFront.customizationMargin;
            CardTheme.Font font = cardFront.font;
            cardFront.getClass();
            return new CardFront(str, customizationDetails, identifier, backgroundImage, cardCustomizationMargin, font, equatableBitmap);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardFront)) {
                return false;
            }
            CardFront cardFront = (CardFront) obj;
            return Intrinsics.areEqual(this.cashtag, cardFront.cashtag) && Intrinsics.areEqual(this.customizationDetails, cardFront.customizationDetails) && this.id == cardFront.id && this.backgroundImage == cardFront.backgroundImage && Intrinsics.areEqual(this.customizationMargin, cardFront.customizationMargin) && this.font == cardFront.font && Intrinsics.areEqual(this.customizationOverride, cardFront.customizationOverride);
        }

        public final int hashCode() {
            String str = this.cashtag;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CustomizationDetails customizationDetails = this.customizationDetails;
            int hashCode2 = (hashCode + (customizationDetails == null ? 0 : customizationDetails.hashCode())) * 31;
            CardTheme.Identifier identifier = this.id;
            int hashCode3 = (hashCode2 + (identifier == null ? 0 : identifier.hashCode())) * 31;
            CardTheme.BackgroundImage backgroundImage = this.backgroundImage;
            int hashCode4 = (hashCode3 + (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 31;
            CardTheme.CardCustomizationMargin cardCustomizationMargin = this.customizationMargin;
            int hashCode5 = (hashCode4 + (cardCustomizationMargin == null ? 0 : cardCustomizationMargin.hashCode())) * 31;
            CardTheme.Font font = this.font;
            int hashCode6 = (hashCode5 + (font == null ? 0 : font.hashCode())) * 31;
            EquatableBitmap equatableBitmap = this.customizationOverride;
            return hashCode6 + (equatableBitmap != null ? equatableBitmap.pixelHash : 0);
        }

        public final String toString() {
            return "CardFront(cashtag=" + this.cashtag + ", customizationDetails=" + this.customizationDetails + ", id=" + this.id + ", backgroundImage=" + this.backgroundImage + ", customizationMargin=" + this.customizationMargin + ", font=" + this.font + ", customizationOverride=" + this.customizationOverride + ")";
        }
    }

    public abstract class Companion {
        public static CardBack toCardBack(ViewModel viewModel) {
            viewModel.getClass();
            return new CardBack(viewModel.cardHolderName, viewModel.cardNumber, viewModel.cardCVV, viewModel.cardExpiration, viewModel.font, viewModel.paymentMethod, viewModel.withRealCard);
        }

        public static CardFront toCardFront(ViewModel viewModel) {
            viewModel.getClass();
            String str = viewModel.cashtag;
            CustomizationDetails customizationDetails = viewModel.customizationDetails;
            if (customizationDetails != null && customizationDetails.strokes.isEmpty() && customizationDetails.stamps.isEmpty()) {
                customizationDetails = null;
            }
            return new CardFront(str, customizationDetails, viewModel.id, viewModel.backgroundImage, viewModel.customizationMargins, viewModel.font, null);
        }
    }

    public final class LoadedChildEntity {
        public Vector4 localTranslation;
        public final MaterialInstance materialInstance;
        public final Mesh mesh;

        public LoadedChildEntity(MaterialInstance materialInstance, Mesh mesh) {
            Vector4 vector4 = new Vector4();
            this.materialInstance = materialInstance;
            this.mesh = mesh;
            this.localTranslation = vector4;
        }
    }

    public final class PanEntity {
        public final Vector4 localTranslation;
        public final float opacity;

        public PanEntity(Vector4 vector4, float f) {
            this.localTranslation = vector4;
            this.opacity = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PanEntity)) {
                return false;
            }
            PanEntity panEntity = (PanEntity) obj;
            return this.localTranslation.equals(panEntity.localTranslation) && Float.compare(this.opacity, panEntity.opacity) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.opacity) + (Arrays.hashCode(this.localTranslation.vector) * 31);
        }

        public final String toString() {
            return "PanEntity(localTranslation=" + this.localTranslation + ", opacity=" + this.opacity + ")";
        }
    }

    public final class ViewModel {
        public final int backInkColor;
        public final int backMagStripColor;
        public final CardTheme.BackgroundImage backgroundImage;
        public final String cardCVV;
        public final String cardExpiration;
        public final String cardHolderName;
        public final String cardNumber;
        public final String cashtag;
        public final float clearCoat;
        public final float clearCoatRoughness;
        public final int color;
        public final CardContouredText contouredText;
        public final float contrast;
        public final CustomizationDetails customizationDetails;
        public final CardTheme.CardCustomizationMargin customizationMargins;
        public final float dimmer;
        public final String environment;
        public final CardTheme.Font font;
        public final float holoOffsetScale;
        public final float holoOffsetX;
        public final float holoOffsetY;
        public final CardTheme.Identifier id;
        public final float indirectLightIntensity;
        public final float inkClearCoat;
        public final float inkClearCoatRoughness;
        public final int inkColor;
        public final float inkRoughness;
        public final boolean isCardLocked;
        public final int magStripColor;
        public final float metallic;
        public final float metallicClearCoat;
        public final float metallicClearCoatRoughness;
        public final float metallicRoughness;
        public final float opacity;
        public final PaymentMethod paymentMethod;
        public final float roughness;
        public final float saturation;
        public final float shimmerOffset;
        public final float shimmerScale;
        public final float vibrance;
        public final boolean withRealCard;

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CardTheme.Identifier.values().length];
                try {
                    iArr[CardTheme.Identifier.HOLO_ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CardTheme.Identifier.GLITTER_ID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CardTheme.Identifier.TORTOISE_ID.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CardTheme.Identifier.BLACK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CardTheme.Identifier.WHITE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CardTheme.Identifier.GLOW_ID.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CardTheme.Identifier.METAL_OIL_SLICK_ID.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CardTheme.Identifier.MOOD_ID.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CardTheme.Identifier.PINK_ID.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public ViewModel(int i, int i2, int i3, CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, CardTheme.Font font, CustomizationDetails customizationDetails, CardTheme.CardCustomizationMargin cardCustomizationMargin, String str, int i4, int i5, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, CardContouredText cardContouredText, boolean z, float f, float f2, int i6, int i7) {
            float f3;
            int i8;
            float f4;
            float f5;
            float f6 = (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1 ? 0.7529412f : 0.972549f;
            float f7 = (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1 ? 0.2901961f : RecyclerView.DECELERATION_RATE;
            float f8 = (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1 ? 0.79607844f : RecyclerView.DECELERATION_RATE;
            float f9 = 0.9f;
            float f10 = (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1 ? 0.9f : 0.54901963f;
            float f11 = (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1 ? RecyclerView.DECELERATION_RATE : 0.32941177f;
            int i9 = identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()];
            if (i9 == 1) {
                f9 = 0.76862746f;
            } else if (i9 != 2 && i9 != 3) {
                f9 = 1.0f;
            }
            CustomizationDetails customizationDetails2 = (i6 & PKIFailureInfo.transactionIdInUse) != 0 ? null : customizationDetails;
            String str6 = (i6 & 8388608) != 0 ? "Reese Hills" : str2;
            String str7 = (i6 & 16777216) != 0 ? "4000 1234 5678 9010" : str3;
            String str8 = (i6 & 33554432) != 0 ? "123" : str4;
            String str9 = (i6 & 67108864) != 0 ? "11/27" : str5;
            PaymentMethod paymentMethod2 = (i6 & 134217728) != 0 ? null : paymentMethod;
            float f12 = (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1 ? 54000.0f : 32000.0f;
            boolean z2 = (i6 & PKIFailureInfo.systemUnavail) != 0;
            CardContouredText cardContouredText2 = (i7 & 1) != 0 ? null : cardContouredText;
            boolean z3 = (i7 & 2) != 0 ? false : z;
            float f13 = (i7 & 4) != 0 ? RecyclerView.DECELERATION_RATE : f;
            float f14 = (i7 & 8) != 0 ? -1.0f : f2;
            if (identifier == null) {
                f3 = f12;
                i8 = -1;
            } else {
                f3 = f12;
                i8 = WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()];
            }
            float f15 = i8 == 1 ? 1.505f : 1.0f;
            float f16 = 1.25f;
            switch (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) {
                case 1:
                    f4 = 0.933f;
                    break;
                case 2:
                default:
                    f4 = 1.0f;
                    break;
                case 3:
                case 4:
                    f4 = 1.25f;
                    break;
                case 5:
                    f4 = 1.027451f;
                    break;
                case 6:
                    f4 = 1.18f;
                    break;
                case 7:
                    f4 = 1.09f;
                    break;
                case 8:
                    f4 = 1.34f;
                    break;
            }
            switch (identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) {
                case 1:
                    f16 = 0.5568628f;
                    f5 = f16;
                    break;
                case 2:
                    f16 = 1.184f;
                    f5 = f16;
                    break;
                case 3:
                    f16 = 1.05f;
                    f5 = f16;
                    break;
                case 4:
                    f16 = 0.58f;
                    f5 = f16;
                    break;
                case 5:
                    f16 = 0.59607846f;
                    f5 = f16;
                    break;
                case 6:
                    f16 = 1.1f;
                    f5 = f16;
                    break;
                case 7:
                    f5 = f16;
                    break;
                case 8:
                    f16 = 1.06f;
                    f5 = f16;
                    break;
                case 9:
                    f16 = 1.16f;
                    f5 = f16;
                    break;
                default:
                    f5 = 1.0f;
                    break;
            }
            re$$ExternalSyntheticOutline0.m1432m(str6, str8, str9);
            this.color = i;
            this.inkColor = i2;
            this.backInkColor = i3;
            this.id = identifier;
            this.backgroundImage = backgroundImage;
            this.roughness = f6;
            this.clearCoat = f7;
            this.clearCoatRoughness = f8;
            this.inkRoughness = 0.75f;
            this.inkClearCoat = 0.16078432f;
            this.inkClearCoatRoughness = 0.05882353f;
            this.metallic = 1.0f;
            this.metallicRoughness = f10;
            this.metallicClearCoat = f11;
            this.metallicClearCoatRoughness = 0.5137f;
            this.font = font;
            this.opacity = f9;
            this.customizationDetails = customizationDetails2;
            this.customizationMargins = cardCustomizationMargin;
            this.cashtag = str;
            this.magStripColor = i4;
            this.backMagStripColor = i5;
            this.cardHolderName = str6;
            this.cardNumber = str7;
            this.cardCVV = str8;
            this.cardExpiration = str9;
            this.paymentMethod = paymentMethod2;
            this.indirectLightIntensity = f3;
            this.environment = "abandoned_hall";
            this.withRealCard = z2;
            this.contouredText = cardContouredText2;
            this.isCardLocked = z3;
            this.dimmer = f13;
            this.shimmerOffset = f14;
            this.shimmerScale = 4.5f;
            this.holoOffsetScale = 0.313f;
            this.holoOffsetX = -0.075f;
            this.holoOffsetY = -0.02f;
            this.vibrance = f15;
            this.contrast = f4;
            this.saturation = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewModel)) {
                return false;
            }
            ViewModel viewModel = (ViewModel) obj;
            return this.color == viewModel.color && this.inkColor == viewModel.inkColor && this.backInkColor == viewModel.backInkColor && this.id == viewModel.id && this.backgroundImage == viewModel.backgroundImage && Float.compare(this.roughness, viewModel.roughness) == 0 && Float.compare(this.clearCoat, viewModel.clearCoat) == 0 && Float.compare(this.clearCoatRoughness, viewModel.clearCoatRoughness) == 0 && Float.compare(this.inkRoughness, viewModel.inkRoughness) == 0 && Float.compare(this.inkClearCoat, viewModel.inkClearCoat) == 0 && Float.compare(this.inkClearCoatRoughness, viewModel.inkClearCoatRoughness) == 0 && Float.compare(this.metallic, viewModel.metallic) == 0 && Float.compare(this.metallicRoughness, viewModel.metallicRoughness) == 0 && Float.compare(this.metallicClearCoat, viewModel.metallicClearCoat) == 0 && Float.compare(this.metallicClearCoatRoughness, viewModel.metallicClearCoatRoughness) == 0 && this.font == viewModel.font && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(this.opacity, viewModel.opacity) == 0 && Intrinsics.areEqual(this.customizationDetails, viewModel.customizationDetails) && Intrinsics.areEqual(this.customizationMargins, viewModel.customizationMargins) && Intrinsics.areEqual(this.cashtag, viewModel.cashtag) && this.magStripColor == viewModel.magStripColor && this.backMagStripColor == viewModel.backMagStripColor && Intrinsics.areEqual(this.cardHolderName, viewModel.cardHolderName) && Intrinsics.areEqual(this.cardNumber, viewModel.cardNumber) && Intrinsics.areEqual(this.cardCVV, viewModel.cardCVV) && Intrinsics.areEqual(this.cardExpiration, viewModel.cardExpiration) && this.paymentMethod == viewModel.paymentMethod && Float.compare(this.indirectLightIntensity, viewModel.indirectLightIntensity) == 0 && Intrinsics.areEqual(this.environment, viewModel.environment) && this.withRealCard == viewModel.withRealCard && Intrinsics.areEqual(this.contouredText, viewModel.contouredText) && this.isCardLocked == viewModel.isCardLocked && Float.compare(this.dimmer, viewModel.dimmer) == 0 && Float.compare(this.shimmerOffset, viewModel.shimmerOffset) == 0 && Float.compare(this.shimmerScale, viewModel.shimmerScale) == 0 && Float.compare(this.holoOffsetScale, viewModel.holoOffsetScale) == 0 && Float.compare(this.holoOffsetX, viewModel.holoOffsetX) == 0 && Float.compare(this.holoOffsetY, viewModel.holoOffsetY) == 0 && Float.compare(this.vibrance, viewModel.vibrance) == 0 && Float.compare(this.contrast, viewModel.contrast) == 0 && Float.compare(this.saturation, viewModel.saturation) == 0;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backInkColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inkColor, Integer.hashCode(this.color) * 31, 31), 31);
            CardTheme.Identifier identifier = this.id;
            int hashCode = (m + (identifier == null ? 0 : identifier.hashCode())) * 31;
            CardTheme.BackgroundImage backgroundImage = this.backgroundImage;
            int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.metallicClearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallicClearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallicRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.metallic, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkClearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkClearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.inkRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.clearCoatRoughness, CameraState$Type$EnumUnboxingLocalUtility.m(this.clearCoat, CameraState$Type$EnumUnboxingLocalUtility.m(this.roughness, (hashCode + (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            CardTheme.Font font = this.font;
            int m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, (m2 + (font == null ? 0 : font.hashCode())) * 31, 31), 31);
            CustomizationDetails customizationDetails = this.customizationDetails;
            int hashCode2 = (m3 + (customizationDetails == null ? 0 : customizationDetails.hashCode())) * 31;
            CardTheme.CardCustomizationMargin cardCustomizationMargin = this.customizationMargins;
            int hashCode3 = (hashCode2 + (cardCustomizationMargin == null ? 0 : cardCustomizationMargin.hashCode())) * 31;
            String str = this.cashtag;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backMagStripColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.magStripColor, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.cardHolderName), 31, this.cardNumber), 31, this.cardCVV), 31, this.cardExpiration);
            PaymentMethod paymentMethod = this.paymentMethod;
            int m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.indirectLightIntensity, (m4 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31, 31), 31, this.environment), 31, false), 31, this.withRealCard);
            CardContouredText cardContouredText = this.contouredText;
            return Float.hashCode(this.saturation) + CameraState$Type$EnumUnboxingLocalUtility.m(this.contrast, CameraState$Type$EnumUnboxingLocalUtility.m(this.vibrance, CameraState$Type$EnumUnboxingLocalUtility.m(this.holoOffsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.holoOffsetX, CameraState$Type$EnumUnboxingLocalUtility.m(this.holoOffsetScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.shimmerScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.shimmerOffset, CameraState$Type$EnumUnboxingLocalUtility.m(this.dimmer, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m5 + (cardContouredText != null ? cardContouredText.hashCode() : 0)) * 31, 31, this.isCardLocked), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.color, this.inkColor, "ViewModel(color=", ", inkColor=", ", backInkColor=");
            m107m.append(this.backInkColor);
            m107m.append(", id=");
            m107m.append(this.id);
            m107m.append(", backgroundImage=");
            m107m.append(this.backgroundImage);
            m107m.append(", roughness=");
            m107m.append(this.roughness);
            m107m.append(", clearCoat=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.clearCoat, ", clearCoatRoughness=", this.clearCoatRoughness, ", inkRoughness=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.inkRoughness, ", inkClearCoat=", this.inkClearCoat, ", inkClearCoatRoughness=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.inkClearCoatRoughness, ", metallic=", this.metallic, ", metallicRoughness=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.metallicRoughness, ", metallicClearCoat=", this.metallicClearCoat, ", metallicClearCoatRoughness=");
            m107m.append(this.metallicClearCoatRoughness);
            m107m.append(", font=");
            m107m.append(this.font);
            m107m.append(", glitterRoughness=0.0, opacity=");
            m107m.append(this.opacity);
            m107m.append(", customizationDetails=");
            m107m.append(this.customizationDetails);
            m107m.append(", customizationMargins=");
            m107m.append(this.customizationMargins);
            m107m.append(", cashtag=");
            m107m.append(this.cashtag);
            m107m.append(", magStripColor=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.magStripColor, this.backMagStripColor, ", backMagStripColor=", ", cardHolderName=", m107m);
            Boxes$$ExternalSyntheticOutline1.m(m107m, this.cardHolderName, ", cardNumber=", this.cardNumber, ", cardCVV=");
            Boxes$$ExternalSyntheticOutline1.m(m107m, this.cardCVV, ", cardExpiration=", this.cardExpiration, ", paymentMethod=");
            m107m.append(this.paymentMethod);
            m107m.append(", indirectLightIntensity=");
            m107m.append(this.indirectLightIntensity);
            m107m.append(", environment=");
            NavAction$$ExternalSyntheticOutline0.m(m107m, this.environment, ", withSkybox=false, withRealCard=", this.withRealCard, ", contouredText=");
            m107m.append(this.contouredText);
            m107m.append(", isCardLocked=");
            m107m.append(this.isCardLocked);
            m107m.append(", dimmer=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.dimmer, ", shimmerOffset=", this.shimmerOffset, ", shimmerScale=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.shimmerScale, ", holoOffsetScale=", this.holoOffsetScale, ", holoOffsetX=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.holoOffsetX, ", holoOffsetY=", this.holoOffsetY, ", vibrance=");
            Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.vibrance, ", contrast=", this.contrast, ", saturation=");
            return Recorder$$ExternalSyntheticOutline1.m(this.saturation, ")", m107m);
        }
    }

    static {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        REMOVE_PAINT = paint;
        Quat quat = new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
        CARD_CAMERA_ROTATION = quat;
        DEFAULT_CARD_ROTATION = new Quat(0.055956185f, 0.084961325f, -0.083761916f, 0.9912797f).times(quat);
        PERPENDICULAR_CARD_DIRECTION = new Vector4(RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, 1.0f);
        LEFT_EYE_OFFSET = new Vector4(0.17f, 1.0f, 0.06f, 1.0f);
        RIGHT_EYE_OFFSET = new Vector4(0.65f, 1.0f, -0.11f, 1.0f);
        DEFAULT_MAG_BACK_COLOR = Color.rgb(14, 21, 22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        final int i = 0;
        this.moodSkin$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.card.onboarding.CardModelView$$ExternalSyntheticLambda0
            public final /* synthetic */ CardModelView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardModelView cardModelView = this.f$0;
                switch (i2) {
                    case 0:
                        Paint paint = CardModelView.REMOVE_PAINT;
                        return BitmapFactory.decodeResource(cardModelView.getResources(), R.drawable.snake_skin_texture);
                    default:
                        Paint paint2 = CardModelView.REMOVE_PAINT;
                        return BitmapFactory.decodeResource(cardModelView.getResources(), R.drawable.card_mood_hand_heat_map);
                }
            }
        });
        final int i2 = 1;
        this.moodHandMask$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.card.onboarding.CardModelView$$ExternalSyntheticLambda0
            public final /* synthetic */ CardModelView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardModelView cardModelView = this.f$0;
                switch (i22) {
                    case 0:
                        Paint paint = CardModelView.REMOVE_PAINT;
                        return BitmapFactory.decodeResource(cardModelView.getResources(), R.drawable.snake_skin_texture);
                    default:
                        Paint paint2 = CardModelView.REMOVE_PAINT;
                        return BitmapFactory.decodeResource(cardModelView.getResources(), R.drawable.card_mood_hand_heat_map);
                }
            }
        });
        TextureSampler textureSampler = new TextureSampler();
        textureSampler.setAnisotropy();
        this.sampler = textureSampler;
        TextureSampler textureSampler2 = new TextureSampler();
        textureSampler2.setAnisotropy();
        textureSampler2.setMinFilter();
        textureSampler2.setMagFilter();
        this.shimmerSampler = textureSampler2;
        this.viewmodels = FlowKt.MutableStateFlow(null);
        this.customizationOverride = FlowKt.MutableStateFlow(null);
        this.iconTextureRelay = FlowKt.MutableStateFlow(null);
        this.touchPoints = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.engineAttachedEvent = PapaEvent.Channel$default(-1, null, null, 6);
        this.loadedChildren = new ArrayList();
        this._isFacingForward$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.cardTranslation = new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        this.cardRotation = DEFAULT_CARD_ROTATION;
        this.cardScale = 1.0f;
        this.indicatorRadius = 0.4f;
        setCameraFovDirection(Camera.Fov.HORIZONTAL);
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass1(i, this, null));
    }

    public static final int access$createLEDLight(CardModelView cardModelView) {
        long nCreateBuilder;
        boolean nBuilderBuild;
        int create = cardModelView.entityManager.create();
        cardModelView.getScene().addEntity(create);
        float[] cct = Colors.cct();
        float f = cct[0];
        float f2 = cct[1];
        float f3 = cct[2];
        nCreateBuilder = LightManager.nCreateBuilder(4);
        new IadFrame(nCreateBuilder, 8);
        LightManager.nBuilderColor(nCreateBuilder, f, f2, f3);
        LightManager.nBuilderIntensity(nCreateBuilder, cardModelView.eyeIntensity);
        nBuilderBuild = LightManager.nBuilderBuild(nCreateBuilder, cardModelView.getEngine().getNativeObject(), create);
        if (nBuilderBuild) {
            return create;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(create, "Couldn't create Light component for entity ", ", see log."));
        return 0;
    }

    public static final Pair access$nullableItems(CardModelView cardModelView, Pair pair) {
        return new Pair(pair != null ? pair.first : null, pair != null ? pair.second : null);
    }

    public static final Texture access$updateOrCreate(CardModelView cardModelView, EquatableBitmap equatableBitmap, EquatableBitmap equatableBitmap2, Texture texture) {
        Bitmap bitmap;
        if (equatableBitmap2 != null && (bitmap = equatableBitmap2.bitmap) != null) {
            Bitmap bitmap2 = equatableBitmap.bitmap;
            if (bitmap2.getWidth() == bitmap.getWidth() && bitmap2.getHeight() == bitmap.getHeight()) {
                TextureType textureType = TextureType.COLOR;
                if (texture == null) {
                    return cardModelView.createTexture(1, bitmap2, textureType);
                }
                Engine engine = cardModelView.getEngine();
                TextureHelper.setBitmap(engine, texture, bitmap2);
                texture.generateMipmaps(engine);
                return texture;
            }
        }
        Texture createTexture = cardModelView.createTexture(1, equatableBitmap.bitmap, TextureType.COLOR);
        if (texture != null) {
            cardModelView.getEngine().destroyTexture(texture);
        }
        return createTexture;
    }

    public static void setParameterColor(MaterialInstance materialInstance, String str, int i, boolean z) {
        if (z) {
            materialInstance.setParameter(str, Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
        } else {
            materialInstance.setParameter(str, Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f);
        }
    }

    public static /* synthetic */ void setTranslation$default(CardModelView cardModelView, float f, float f2, float f3, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setTranslation");
            return;
        }
        if ((i & 1) != 0) {
            f = cardModelView.cardTranslation[0];
        }
        if ((i & 2) != 0) {
            f2 = cardModelView.cardTranslation[1];
        }
        if ((i & 4) != 0) {
            f3 = cardModelView.cardTranslation[2];
        }
        cardModelView.setTranslation(f, f2, f3);
    }

    public static Texture updateOrCreate$default(CardModelView cardModelView, Texture texture, Bitmap bitmap, TextureType textureType) {
        if (texture == null) {
            return cardModelView.createTexture(255, bitmap, textureType);
        }
        Engine engine = cardModelView.getEngine();
        bitmap.getClass();
        TextureHelper.setBitmap(engine, texture, bitmap);
        texture.generateMipmaps(engine);
        return texture;
    }

    @Override // com.squareup.cash.filament.BaseModelView
    public final void onEngineAttached() {
        super.onEngineAttached();
        StateFlowKt.sendOrThrow$default(this.engineAttachedEvent, Unit.INSTANCE);
        if (this.textureState == null) {
            this.textureState = new CardTextureState(getEngine(), 2046);
        }
    }

    @Override // com.squareup.cash.filament.BaseModelView
    public final void onEngineDetached() {
        if (getEngine().isValid()) {
            Mesh mesh = this.mesh;
            if (mesh != null) {
                MeshLoaderKt.destroyMesh(getEngine(), mesh);
            }
            Mesh mesh2 = this.meshBack;
            if (mesh2 != null) {
                MeshLoaderKt.destroyMesh(getEngine(), mesh2);
            }
            MaterialInstance materialInstance = this.materialInstance;
            if (materialInstance != null) {
                getEngine().destroyMaterialInstance(materialInstance);
            }
            MaterialInstance materialInstance2 = this.materialInstanceBack;
            if (materialInstance2 != null) {
                getEngine().destroyMaterialInstance(materialInstance2);
            }
            Material material = this.material;
            if (material != null) {
                getEngine().destroyMaterial(material);
            }
            Mesh mesh3 = this.contouredTextMesh;
            if (mesh3 != null) {
                MeshLoaderKt.destroyMesh(getEngine(), mesh3);
            }
            MaterialInstance materialInstance3 = this.textMaterialInstance;
            if (materialInstance3 != null) {
                getEngine().destroyMaterialInstance(materialInstance3);
            }
            this.contouredTextMesh = null;
            this.textMaterialInstance = null;
            ArrayList arrayList = this.loadedChildren;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LoadedChildEntity loadedChildEntity = (LoadedChildEntity) it.next();
                MeshLoaderKt.destroyMesh(getEngine(), loadedChildEntity.mesh);
                getEngine().destroyMaterialInstance(loadedChildEntity.materialInstance);
            }
            arrayList.clear();
            Material material2 = this.copyMaterial;
            if (material2 != null) {
                getEngine().destroyMaterial(material2);
            }
            if (!this.persistEngine) {
                CardTextureState cardTextureState = this.textureState;
                if (cardTextureState == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textureState");
                    throw null;
                }
                cardTextureState.destroyTextures();
            }
            safeDestroySkybox();
            safeDestroyIndirectLight();
            safeDestroySpotlight();
            this.mesh = null;
            this.meshBack = null;
            this.materialInstance = null;
            this.materialInstanceBack = null;
            this.material = null;
            this.copyMaterial = null;
            this.cardInitialized = false;
            super.onEngineDetached();
        }
    }

    public final void render(ViewModel viewModel) {
        StateFlowImpl stateFlowImpl;
        Object value;
        viewModel.getClass();
        do {
            stateFlowImpl = this.viewmodels;
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.compareAndSet(value, viewModel));
    }

    public final void safeDestroyIndirectLight() {
        Pair pair = this.indirectLightEntities;
        if (pair != null) {
            getScene().setIndirectLight(null);
            getEngine().destroyIndirectLight((IndirectLight) pair.first);
            getEngine().destroyTexture((Texture) pair.second);
        }
        this.indirectLightEntities = null;
    }

    public final void safeDestroySkybox() {
        Pair pair = this.skyboxEntities;
        if (pair != null) {
            getScene().setSkybox(null);
            getEngine().destroySkybox((Skybox) pair.first);
            getEngine().destroyTexture((Texture) pair.second);
        }
        this.skyboxEntities = null;
    }

    public final void safeDestroySpotlight() {
        Iterator it = ArraysKt___ArraysKt.filterNotNull(new Integer[]{this.leftEye, this.rightEye}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            getEngine().destroyEntity(intValue);
            this.entityManager.destroy(intValue);
        }
        this.leftEye = null;
        this.rightEye = null;
    }

    @Override // com.squareup.cash.filament.BaseModelView
    public final boolean sceneInitialized() {
        return this.cardInitialized;
    }

    public final void setCardRotation(Quat quat) {
        quat.getClass();
        this.cardRotation = quat;
        updateTransform();
    }

    public final void setCardScale(float f) {
        this.cardScale = f;
        updateTransform();
    }

    public final void setCardTranslation(float[] fArr) {
        fArr.getClass();
        this.cardTranslation = fArr;
        updateTransform();
    }

    public final void setChildrenLocal(List<PanEntity> list) {
        list.getClass();
        while (true) {
            int size = list.size();
            ArrayList arrayList = this.loadedChildren;
            if (size == arrayList.size()) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    PanEntity panEntity = (PanEntity) obj;
                    LoadedChildEntity loadedChildEntity = (LoadedChildEntity) arrayList.get(i);
                    Vector4 vector4 = panEntity.localTranslation;
                    loadedChildEntity.getClass();
                    MaterialInstance materialInstance = loadedChildEntity.materialInstance;
                    loadedChildEntity.localTranslation = vector4;
                    materialInstance.setParameter("opacity", panEntity.opacity);
                    CardTextureState cardTextureState = this.textureState;
                    if (cardTextureState == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    Pair pair = cardTextureState.copyPanTexture;
                    Texture texture = pair != null ? (Texture) pair.second : null;
                    texture.getClass();
                    materialInstance.setParameter("albedo", texture, this.sampler);
                    materialInstance.setParameter("textureScale", 1.0f, 1.0f);
                    i = i2;
                }
                updateTransform();
                return;
            }
            if (list.size() > arrayList.size()) {
                CardModelView$1$3$4$2 cardModelView$1$3$4$2 = this.childEntityFactory;
                if (cardModelView$1$3$4$2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("childEntityFactory");
                    throw null;
                }
                arrayList.add(cardModelView$1$3$4$2.invoke());
            } else {
                LoadedChildEntity loadedChildEntity2 = (LoadedChildEntity) arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
                MeshLoaderKt.destroyMesh(getEngine(), loadedChildEntity2.mesh);
                getEngine().destroyMaterialInstance(loadedChildEntity2.materialInstance);
            }
        }
    }

    public final void setCustomizationMask(Bitmap bitmap) {
        StateFlowImpl stateFlowImpl;
        Object value;
        do {
            stateFlowImpl = this.customizationOverride;
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.compareAndSet(value, bitmap));
    }

    public final void setEyeIntensity(float f) {
        this.eyeIntensity = f;
        Iterator it = ArraysKt___ArraysKt.filterNotNull(new Integer[]{this.leftEye, this.rightEye}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            LightManager lightManager = getEngine().mLightManager;
            lightManager.setIntensity(f, lightManager.getInstance(intValue));
        }
    }

    public final void setIcon(Bitmap bitmap) {
        StateFlowImpl stateFlowImpl;
        Object value;
        bitmap.getClass();
        do {
            stateFlowImpl = this.iconTextureRelay;
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.compareAndSet(value, bitmap));
    }

    public final void setIndicatorColor(int i) {
        this.indicatorColor = i;
        Iterator it = ArraysKt___ArraysKt.filterNotNull(new MaterialInstance[]{this.materialInstance, this.materialInstanceBack}).iterator();
        while (it.hasNext()) {
            setParameterColor((MaterialInstance) it.next(), "indicatorColor", this.indicatorColor, true);
        }
    }

    public final void setIndicatorRadius(float f) {
        this.indicatorRadius = f;
        Iterator it = ArraysKt___ArraysKt.filterNotNull(new MaterialInstance[]{this.materialInstance, this.materialInstanceBack}).iterator();
        while (it.hasNext()) {
            ((MaterialInstance) it.next()).setParameter("indicatorRadius", this.indicatorRadius);
        }
        scheduleRedraw();
    }

    public final void setOnError(Function0<Unit> function0) {
        this.onError = function0;
    }

    public final void setTranslation(float f, float f2, float f3) {
        setCardTranslation(new float[]{f, f2, f3});
    }

    public final PointF touchTextureIntersect(PointF pointF) {
        Mesh mesh = this.mesh;
        if (mesh == null) {
            return null;
        }
        float[] fArr = new float[16];
        getEngine().mTransformManager.getTransform(getEngine().mTransformManager.getInstance(mesh.renderable), fArr);
        Vector4 vector4 = touchToWorldCoordinate(new Vector4(pointF.x, pointF.y, getCamera().getNear(), 1.0f));
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.invertM(fArr2, 0, fArr, 0);
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, vector4.vector, 0);
        Vector4 vector42 = new Vector4(fArr3);
        Vector4 vector43 = touchToWorldCoordinate(new Vector4(pointF.x, pointF.y, getCamera().getCullingFar(), 1.0f));
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.invertM(fArr4, 0, fArr, 0);
        float[] fArr5 = new float[4];
        Matrix.multiplyMV(fArr5, 0, fArr4, 0, vector43.vector, 0);
        Vector4 vector44 = new Vector4(fArr5);
        float[] fArr6 = vector42.vector;
        float f = fArr6[1];
        float[] fArr7 = vector44.vector;
        float abs = Math.abs(f / (fArr7[1] - f));
        float f2 = fArr6[0];
        float m = CameraState$Type$EnumUnboxingLocalUtility.m(fArr7[0], f2, abs, f2);
        float f3 = fArr6[1];
        float f4 = fArr7[1];
        float m2 = CameraState$Type$EnumUnboxingLocalUtility.m(f4, f3, abs, f3);
        float f5 = fArr6[2];
        float[] fArr8 = {m, m2, CameraState$Type$EnumUnboxingLocalUtility.m(fArr7[2], f5, abs, f5), 1.0f};
        Box box = mesh.aabb;
        float[] fArr9 = (float[]) box.mCenter;
        float f6 = fArr9[0];
        float[] fArr10 = (float[]) box.mHalfExtent;
        float f7 = fArr10[0];
        float f8 = f6 - f7;
        float f9 = f6 + f7;
        float f10 = fArr8[0];
        if (f10 < f8 || f10 > f9) {
            return null;
        }
        float f11 = fArr9[1];
        float f12 = fArr10[1];
        float f13 = f11 - f12;
        float f14 = f12 + f11;
        float f15 = fArr8[1];
        if (f15 < f13 || f15 > f14) {
            return null;
        }
        float f16 = fArr9[2];
        float f17 = fArr10[2];
        float f18 = f16 - f17;
        float f19 = f16 + f17;
        float f20 = fArr8[2];
        if (f20 < f18 || f20 > f19) {
            return null;
        }
        float f21 = (f10 + f7) / (f7 * 2.0f);
        float f22 = (((f20 + f17) / (2.0f * f17)) * 612.0f) / 1307.0f;
        if (f4 > f11) {
            f21 = 1.0f - f21;
            f22 += 0.5317521f;
        }
        return new PointF(f21, f22);
    }

    public final Vector4 touchToWorldCoordinate(Vector4 vector4) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        getCamera().getViewMatrix(fArr);
        double[] dArr = new double[16];
        getCamera().getCullingProjectionMatrix(dArr);
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 16; i++) {
            arrayList.add(Float.valueOf((float) dArr[i]));
        }
        float[] floatArray = CollectionsKt.toFloatArray(arrayList);
        float[] fArr2 = vector4.vector;
        float[] fArr3 = {((fArr2[0] / getWidth()) * 2.0f) - 1.0f, (((getHeight() - fArr2[1]) / getHeight()) * 2.0f) - 1.0f, (((fArr2[2] - getCamera().getNear()) / (getCamera().getCullingFar() - getCamera().getNear())) * 2.0f) - 1.0f, 1.0f};
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.invertM(fArr4, 0, floatArray, 0);
        float[] fArr5 = new float[4];
        Matrix.multiplyMV(fArr5, 0, fArr4, 0, fArr3, 0);
        float f = fArr5[0];
        float f2 = fArr5[3];
        Vector4 vector42 = new Vector4(f / f2, fArr5[1] / f2, fArr5[2] / f2, 1.0f);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        Matrix.invertM(fArr6, 0, fArr, 0);
        float[] fArr7 = new float[4];
        Matrix.multiplyMV(fArr7, 0, fArr6, 0, vector42.vector, 0);
        return new Vector4(fArr7);
    }

    public final void updateTextureState(CardTextureState cardTextureState, CardModelView cardModelView) {
        cardTextureState.getClass();
        this.textureState = cardTextureState;
        setEngine(cardTextureState.engine);
        this.persistEngine = true;
        if (cardModelView != null) {
            this.viewmodels.setValue(cardModelView.viewmodels.getValue());
            this.customizationOverride.setValue(cardModelView.customizationOverride.getValue());
            this.iconTextureRelay.setValue(cardModelView.iconTextureRelay.getValue());
            setIndicatorColor(cardModelView.indicatorColor);
            setIndicatorRadius(cardModelView.indicatorRadius);
        }
    }

    public final void updateTransform() {
        int i;
        float[] rotationTransform = this.cardRotation.toRotationTransform();
        float f = this.cardScale;
        Matrix.scaleM(rotationTransform, 0, f, f, f);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = this.cardTranslation;
        Matrix.translateM(fArr, 0, fArr2[0], fArr2[1], fArr2[2]);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.multiplyMM(fArr3, 0, fArr, 0, rotationTransform, 0);
        Mesh mesh = this.mesh;
        if (mesh != null) {
            updateTransform(mesh.renderable, fArr3);
            Integer num = this.leftEye;
            Integer num2 = this.rightEye;
            if (num != null && num2 != null) {
                float[] fArr4 = (float[]) mesh.aabb.mHalfExtent;
                Vector4 vector4 = new Vector4(fArr4[0], fArr4[1], fArr4[2], 1.0f);
                float[] fArr5 = new float[4];
                Matrix.multiplyMV(fArr5, 0, fArr3, 0, vector4.times(LEFT_EYE_OFFSET).vector, 0);
                LightManager lightManager = getEngine().mLightManager;
                lightManager.getClass();
                lightManager.setPosition(fArr5[0], fArr5[1], fArr5[2], lightManager.getInstance(num.intValue()));
                float[] fArr6 = new float[4];
                Matrix.multiplyMV(fArr6, 0, fArr3, 0, vector4.times(RIGHT_EYE_OFFSET).vector, 0);
                LightManager lightManager2 = getEngine().mLightManager;
                lightManager2.getClass();
                lightManager2.setPosition(fArr6[0], fArr6[1], fArr6[2], lightManager2.getInstance(num2.intValue()));
                float[] rotationTransform2 = this.cardRotation.toRotationTransform();
                Vector4 vector42 = PERPENDICULAR_CARD_DIRECTION;
                vector42.getClass();
                float[] fArr7 = new float[4];
                Matrix.multiplyMV(fArr7, 0, rotationTransform2, 0, vector42.vector, 0);
                LightManager lightManager3 = getEngine().mLightManager;
                lightManager3.getClass();
                lightManager3.setDirection(fArr7[0], fArr7[1], fArr7[2], lightManager3.getInstance(num.intValue()));
                LightManager lightManager4 = getEngine().mLightManager;
                lightManager4.getClass();
                lightManager4.setDirection(fArr7[0], fArr7[1], fArr7[2], lightManager4.getInstance(num2.intValue()));
            }
        }
        Mesh mesh2 = this.meshBack;
        if (mesh2 != null) {
            float[] fArr8 = new float[16];
            Matrix.setIdentityM(fArr8, 0);
            float[] fArr9 = this.cardTranslation;
            Matrix.translateM(fArr8, 0, fArr9[0], fArr9[1], fArr9[2] - 1.0E-4f);
            float[] fArr10 = new float[16];
            Matrix.setIdentityM(fArr10, 0);
            i = 4;
            Matrix.multiplyMM(fArr10, 0, fArr8, 0, rotationTransform, 0);
            updateTransform(mesh2.renderable, fArr10);
        } else {
            i = 4;
        }
        Iterator it = this.loadedChildren.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            LoadedChildEntity loadedChildEntity = (LoadedChildEntity) next;
            float[] fArr11 = new float[16];
            Matrix.setIdentityM(fArr11, 0);
            float[] fArr12 = loadedChildEntity.localTranslation.vector;
            Matrix.translateM(fArr11, 0, fArr12[0], fArr12[1], fArr12[2]);
            int i4 = loadedChildEntity.mesh.renderable;
            float[] fArr13 = new float[16];
            Matrix.setIdentityM(fArr13, 0);
            Matrix.multiplyMM(fArr13, 0, fArr3, 0, fArr11, 0);
            updateTransform(i4, fArr13);
            i = i;
            i2 = i3;
        }
        int i5 = i;
        Mesh mesh3 = this.contouredTextMesh;
        if (mesh3 != null) {
            updateTransform(mesh3.renderable, fArr3);
        }
        float[] fArr14 = new float[i5];
        // fill-array-data instruction
        fArr14[0] = 0.0f;
        fArr14[1] = 1.0f;
        fArr14[2] = 0.0f;
        fArr14[3] = 0.0f;
        float[] fArr15 = new float[i5];
        Matrix.multiplyMV(fArr15, 0, rotationTransform, 0, fArr14, 0);
        this._isFacingForward$delegate.setValue(Boolean.valueOf(fArr15[2] > RecyclerView.DECELERATION_RATE));
    }

    /* renamed from: com.squareup.cash.card.onboarding.CardModelView$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ CardModelView this$0;

        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00581 extends SuspendLambda implements Function2 {
            public final /* synthetic */ int $r8$classId;
            public int label;
            public final /* synthetic */ Object this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00581(Object obj, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                int i = this.$r8$classId;
                Object obj2 = this.this$0;
                switch (i) {
                    case 0:
                        return new C00581((CardModelView) obj2, continuation, 0);
                    case 1:
                        return new C00581((EarnerUpsellBlockerPresenter) obj2, continuation, 1);
                    case 2:
                        return new C00581((LocalPosCheckInPresenter) obj2, continuation, 2);
                    case 3:
                        return new C00581((PromotionPanePresenter) obj2, continuation, 3);
                    case 4:
                        return new C00581((RegisterAliasPresenter) obj2, continuation, 4);
                    case 5:
                        return new C00581((RequestPushNotificationsBlockerPresenter) obj2, continuation, 5);
                    case 6:
                        return new C00581((CardLockPresenter) obj2, continuation, 6);
                    case 7:
                        return new C00581((LocalHomePresenter) obj2, continuation, 7);
                    case 8:
                        return new C00581((SsnPresenter) obj2, continuation, 8);
                    case 9:
                        return new C00581((StatusResultPresenter) obj2, continuation, 9);
                    case 10:
                        return new C00581((VerifyAliasPresenter) obj2, continuation, 10);
                    case 11:
                        return new C00581((VerifyContactsPresenter) obj2, continuation, 11);
                    case 12:
                        return new C00581((WebViewBlockerBridge) obj2, continuation, 12);
                    case 13:
                        return new C00581((RealBoostConfigManager) obj2, continuation, 13);
                    case 14:
                        return new C00581((LocalPosCheckInPresenter) obj2, continuation, 14);
                    case 15:
                        return new C00581((BrazeSetupTeardownActivityWorker) obj2, continuation, 15);
                    case 16:
                        return new C00581((RealBrazeManager) obj2, continuation, 16);
                    case 17:
                        return new C00581((CardStudioPresenter) obj2, continuation, 17);
                    case 18:
                        return new C00581((CardLockPresenter) obj2, continuation, 18);
                    case 19:
                        return new C00581((LiteCashInPresenter) obj2, continuation, 19);
                    case 20:
                        return new C00581((StatusInterstitialPresenter) obj2, continuation, 20);
                    case 21:
                        return new C00581((n) obj2, continuation, 21);
                    case 22:
                        return new C00581((InvestingRouter) obj2, continuation, 22);
                    case 23:
                        return new C00581((LocalRouter) obj2, continuation, 23);
                    case 24:
                        return new C00581((ArcadeShaker) obj2, continuation, 24);
                    case 25:
                        return new C00581((RegularShaker) obj2, continuation, 25);
                    case 26:
                        return new C00581((PressGestureScopeImpl) obj2, continuation, 26);
                    case 27:
                        return new C00581((RealFlowStarter) obj2, continuation, 27);
                    case 28:
                        return new C00581((RealContactSyncEventAggregator) obj2, continuation, 28);
                    default:
                        return new C00581((RealContactSyncRoutineAggregator) obj2, continuation, 29);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                    case 12:
                        ((C00581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        break;
                }
                return ((C00581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:229:0x03c1, code lost:
            
                if (r1 == r0) goto L200;
             */
            /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:237:0x03af, code lost:
            
                if (r1 == r0) goto L200;
             */
            /* JADX WARN: Code restructure failed: missing block: B:387:0x0610, code lost:
            
                if (kotlinx.coroutines.JobKt.withContext(r2, r3, r18) == r0) goto L334;
             */
            /* JADX WARN: Code restructure failed: missing block: B:389:?, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:391:0x05fc, code lost:
            
                if (r1 == r0) goto L334;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
            
                if (r1.join(r18) == r0) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
            
                if (r1.join(r18) == r0) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0165, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, null, null, r18, 12) == r13) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
            
                return r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x014d, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r2, r1, null, null, r18, 12) == r13) goto L74;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Lifecycle lifecycle;
                String str;
                GetFlowRequest getFlowRequest;
                Object flow;
                Object first;
                Object boostConfigDirect;
                Object until;
                int i = this.$r8$classId;
                int i2 = 22;
                int i3 = 24;
                int i4 = 4;
                int i5 = 0;
                int i6 = 6;
                int i7 = 2;
                Object obj2 = this.this$0;
                int i8 = 1;
                Continuation continuation = null;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                switch (i) {
                    case 0:
                        CardModelView cardModelView = (CardModelView) obj2;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i9 = this.label;
                        if (i9 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            LifecycleOwner lifecycleOwner = DBUtil.get(cardModelView);
                            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                                CallbackFlowBuilder callbackFlow = FlowKt.callbackFlow(new PageFetcher$flow$1((Object) lifecycle, (Continuation) (z ? 1 : 0), 19));
                                DefaultScheduler defaultScheduler = Dispatchers.Default;
                                Flow flowOn = FlowKt.flowOn(callbackFlow, MainDispatcherLoader.dispatcher.immediate);
                                if (flowOn != null) {
                                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(new CardModelView$iconTexture$$inlined$map$1(flowOn, i2), 1);
                                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(cardModelView, i8);
                                    this.label = 1;
                                    if (drop.collect(anonymousClass5, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 1:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.label;
                        if (i10 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            if (EarnerUpsellBlockerPresenter.access$submitUpsellAndAdvance((EarnerUpsellBlockerPresenter) obj2, this) == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                        } else {
                            if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                        FlowNavigationHelper flowNavigationHelper = (FlowNavigationHelper) localPosCheckInPresenter.stringManager;
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                        BlockersScreens.StartFlowEntryPoint startFlowEntryPoint = (BlockersScreens.StartFlowEntryPoint) localPosCheckInPresenter.cameraPermissions;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = this.label;
                        if (i11 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            int ordinal = startFlowEntryPoint.getRoute().ordinal();
                            if (ordinal == 0) {
                                str = "/2.0/cash/get-flow";
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                str = "cash-app/investing/get-flow";
                            }
                            String str2 = str;
                            String initiationData = startFlowEntryPoint.getInitiationData();
                            if (initiationData != null) {
                                getFlowRequest = new GetFlowRequest(startFlowEntryPoint.getBlockersData().requestContext, new GetFlowRequest.Input.InitiationData(initiationData), i4);
                            } else {
                                Flow$Type flow$Type = startFlowEntryPoint.getBlockersData().flowType;
                                flow$Type.getClass();
                                getFlowRequest = new GetFlowRequest((RequestContext) (z2 ? 1 : 0), (GetFlowRequest.Input) new GetFlowRequest.Input.FlowType(flow$Type), 5);
                            }
                            GetFlowRequest getFlowRequest2 = getFlowRequest;
                            AppService appService = (AppService) localPosCheckInPresenter.store;
                            BlockersData.MoneybotContext moneybotContext = startFlowEntryPoint.getBlockersData().moneybotContext;
                            String str3 = moneybotContext != null ? moneybotContext.sessionId : null;
                            BlockersData.MoneybotContext moneybotContext2 = startFlowEntryPoint.getBlockersData().moneybotContext;
                            String str4 = moneybotContext2 != null ? moneybotContext2.toolRequestId : null;
                            this.label = 1;
                            flow = appService.getFlow(str2, str3, str4, getFlowRequest2, this);
                            if (flow == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            flow = obj;
                        }
                        ApiResult apiResult = (ApiResult) flow;
                        if (apiResult instanceof ApiResult.Success) {
                            Screen flowSuccessScreen = flowNavigationHelper.getFlowSuccessScreen(startFlowEntryPoint, (ApiResult.Success) apiResult, startFlowEntryPoint.getBlockersData(), true);
                            if ((startFlowEntryPoint instanceof BlockersScreens.StartFlowEntryPointScreen) && (flowSuccessScreen instanceof BottomSheetScreen)) {
                                screenNavigator.goTo(PaymentScreens$HomeScreens$Home.INSTANCE);
                            }
                            screenNavigator.goTo(flowSuccessScreen);
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(flowNavigationHelper.getFlowFailureScreen(startFlowEntryPoint, (ApiResult.Failure) apiResult, startFlowEntryPoint.getBlockersData()));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        PromotionPanePresenter promotionPanePresenter = (PromotionPanePresenter) obj2;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i12 = this.label;
                        if (i12 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(((RealBalanceSnapshotManager) promotionPanePresenter.drawerOpener.a).select(), i5), i3);
                            this.label = 1;
                            first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                            break;
                        } else {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            first = obj;
                        }
                        CoroutineContext coroutineContext = promotionPanePresenter.uiDispatcher;
                        InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2((Object) promotionPanePresenter, first, (Continuation) (z3 ? 1 : 0), 10);
                        this.label = 2;
                        break;
                    case 4:
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i13 = this.label;
                        if (i13 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) obj2;
                            KeyValue keyValue = registerAliasPresenter.isLanguageDisclosureAcceptancePending;
                            Boolean valueOf = Boolean.valueOf(BundleKt.isSpanish((Locale) registerAliasPresenter.localeManager.resolvedLocale.$$delegate_0.getValue()));
                            this.label = 1;
                            if (keyValue.set(valueOf, this) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 5:
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i14 = this.label;
                        if (i14 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            List list = RequestPushNotificationsBlockerPresenter.ACCOUNT_HOLDER_LEVEL_CATEGORIES;
                            if (((RequestPushNotificationsBlockerPresenter) obj2).progressToNextScreen(this) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 6:
                        CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i15 = this.label;
                        if (i15 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            FinishSetupTileBadgeCounter blockersConfig = ((RealAppConfigManager) ((AppConfigManager) cardLockPresenter.issuedCardManager)).blockersConfig();
                            this.label = 1;
                            Object collect = blockersConfig.collect(new PasscodeViewKt$Passcode$3$1$1$1$2(21, SetAddressPresenter$models$2$1$2.INSTANCE, cardLockPresenter), this);
                            if (collect != coroutineSingletons7) {
                                collect = Unit.INSTANCE;
                            }
                            if (collect == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 7:
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i16 = this.label;
                        if (i16 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                            RealBlockersHelper realBlockersHelper = (RealBlockersHelper) localHomePresenter.embeddedMapEnabled$delegate;
                            BlockersScreens.SignatureScreen signatureScreen = (BlockersScreens.SignatureScreen) localHomePresenter.syncer;
                            BlockerAction blockerAction = signatureScreen.dismissAction;
                            this.label = 1;
                            if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, signatureScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                        } else {
                            if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 8:
                        SsnPresenter ssnPresenter = (SsnPresenter) obj2;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i17 = this.label;
                        if (i17 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow((BufferedChannel) ((DisclosurePresenter) ssnPresenter.idvPresenter).navigator);
                            RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$1 = new RealBrazeManager$openSession$1$1(ssnPresenter, 12);
                            this.label = 1;
                            if (consumeAsFlow.collect(realBrazeManager$openSession$1$1, this) == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                        } else {
                            if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 9:
                        StatusResultPresenter statusResultPresenter = (StatusResultPresenter) obj2;
                        BlockersScreens.StatusResultScreen statusResultScreen = statusResultPresenter.args;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i18 = this.label;
                        if (i18 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            if ((PlatformKt.getCurrentSessionState(statusResultPresenter.sessionManager) instanceof SessionState.Authenticated) && (statusResultScreen.getFlow() == BlockersData.Flow.PAYMENT || statusResultScreen.getFlow() == BlockersData.Flow.TRANSFER || statusResultScreen.getFlow() == BlockersData.Flow.STATUS_RESULT || statusResultScreen.getBlockersData().clientScenario == ClientScenario.TRANSFER_CRYPTOCURRENCY || statusResultScreen.getBlockersData().clientScenario == ClientScenario.EXCHANGE_CURRENCY)) {
                                RealReferralManager realReferralManager = statusResultPresenter.referralManager;
                                this.label = 1;
                                if (realReferralManager.refresh(true, this) == coroutineSingletons10) {
                                    return coroutineSingletons10;
                                }
                            }
                        } else {
                            if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 10:
                        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i19 = this.label;
                        if (i19 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            VerifyAliasPresenter verifyAliasPresenter = (VerifyAliasPresenter) obj2;
                            this.label = 1;
                            BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
                            BlockerAction blockerAction2 = verifyAliasScreen.dismissAction;
                            if (blockerAction2 == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("dismiss_action can't be null here, this is an app bug.");
                                return null;
                            }
                            Object handleBlockerAction$default = BlockersHelper.handleBlockerAction$default(verifyAliasPresenter.blockersHelper, blockerAction2, verifyAliasScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            Object obj4 = handleBlockerAction$default;
                            if (handleBlockerAction$default != obj3) {
                                obj4 = Unit.INSTANCE;
                            }
                            if (obj4 == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 11:
                        VerifyContactsPresenter verifyContactsPresenter = (VerifyContactsPresenter) obj2;
                        BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter.args;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i20 = this.label;
                        if (i20 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealBlockersHelper realBlockersHelper2 = verifyContactsPresenter.blockersHelper;
                            BlockerAction blockerAction3 = contactVerificationScreen.dismissAction;
                            blockerAction3.getClass();
                            this.label = 1;
                            if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, blockerAction3, contactVerificationScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons11) {
                                return coroutineSingletons11;
                            }
                        } else {
                            if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 12:
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i21 = this.label;
                        try {
                            if (i21 == 0) {
                                SafeTrace.throwOnFailure(obj);
                                this.label = 1;
                                JobKt.awaitCancellation(this);
                                return coroutineSingletons12;
                            }
                            if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        } finally {
                        }
                    case 13:
                        RealBoostConfigManager realBoostConfigManager = (RealBoostConfigManager) obj2;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i22 = this.label;
                        if (i22 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            long millis = realBoostConfigManager.clock.millis() - realBoostConfigManager.lastUpdated;
                            BoostConfigManager.Companion.getClass();
                            if (millis >= Duration.m4167getInWholeMillisecondsimpl(BoostConfigManager.Companion.TTL)) {
                                Timber.Forest.d("Updating boost config...", new Object[0]);
                                RewardlyExternalAppService rewardlyExternalAppService = realBoostConfigManager.service;
                                GetBoostConfigRequest getBoostConfigRequest = new GetBoostConfigRequest(ByteString.EMPTY);
                                this.label = 1;
                                boostConfigDirect = rewardlyExternalAppService.getBoostConfigDirect(getBoostConfigRequest, this);
                                break;
                            } else {
                                Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m(realBoostConfigManager.lastUpdated, "Not updating boost config. Last update was at "), new Object[0]);
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i22 != 1) {
                                if (i22 != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                until = obj;
                                return (Unit) until;
                            }
                            SafeTrace.throwOnFailure(obj);
                            boostConfigDirect = obj;
                        }
                        Signal signal = realBoostConfigManager.signOutSignal;
                        SessionWorker$doWork$2$1 sessionWorker$doWork$2$1 = new SessionWorker$doWork$2$1((ApiResult) boostConfigDirect, realBoostConfigManager, z4 ? 1 : 0, i4);
                        this.label = 2;
                        until = StateFlowKt.until(signal, sessionWorker$doWork$2$1, this);
                        break;
                    case 14:
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i23 = this.label;
                        try {
                            if (i23 == 0) {
                                SafeTrace.throwOnFailure(obj);
                                LendingAppService lendingAppService = (LendingAppService) ((LocalPosCheckInPresenter) obj2).launcher;
                                EntryPointTappedRequest entryPointTappedRequest = new EntryPointTappedRequest(null, ByteString.EMPTY);
                                this.label = 1;
                                if (lendingAppService.entryPointTapped(entryPointTappedRequest, this) == coroutineSingletons14) {
                                    return coroutineSingletons14;
                                }
                            } else {
                                if (i23 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                            }
                        } catch (Throwable unused) {
                        }
                        return Unit.INSTANCE;
                    case 15:
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i24 = this.label;
                        if (i24 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            BrazeSetupTeardownActivityWorker brazeSetupTeardownActivityWorker = (BrazeSetupTeardownActivityWorker) obj2;
                            Flow flow2 = brazeSetupTeardownActivityWorker.signOut;
                            RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$12 = new RealBrazeManager$openSession$1$1(brazeSetupTeardownActivityWorker, 27);
                            this.label = 1;
                            if (flow2.collect(realBrazeManager$openSession$1$12, this) == coroutineSingletons15) {
                                return coroutineSingletons15;
                            }
                        } else {
                            if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 16:
                        RealBrazeManager realBrazeManager = (RealBrazeManager) obj2;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i25 = this.label;
                        if (i25 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            SessionManagerKt$special$$inlined$filterIsInstance$1 onAuthenticated = PlatformKt.getOnAuthenticated(realBrazeManager.sessionManager);
                            RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$13 = new RealBrazeManager$openSession$1$1(realBrazeManager, i5);
                            this.label = 1;
                            if (onAuthenticated.collect(realBrazeManager$openSession$1$13, this) == coroutineSingletons16) {
                                return coroutineSingletons16;
                            }
                        } else {
                            if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 17:
                        Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i26 = this.label;
                        if (i26 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                            this.label = 1;
                            Object withContext = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new TemporaryStorage$getDir$2(cardStudioPresenter, z5 ? 1 : 0, 13), this);
                            Object obj6 = withContext;
                            if (withContext != obj5) {
                                obj6 = Unit.INSTANCE;
                            }
                            if (obj6 == obj5) {
                                return obj5;
                            }
                        } else {
                            if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 18:
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i27 = this.label;
                        if (i27 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            if (CardLockPresenter.access$refreshHome((CardLockPresenter) obj2, this) == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                        } else {
                            if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 19:
                        LiteCashInPresenter liteCashInPresenter = (LiteCashInPresenter) obj2;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i28 = this.label;
                        try {
                            if (i28 == 0) {
                                SafeTrace.throwOnFailure(obj);
                                this.label = 1;
                                if (LiteCashInPresenter.access$runSignatureFlow(liteCashInPresenter, this) == coroutineSingletons18) {
                                    return coroutineSingletons18;
                                }
                            } else {
                                if (i28 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                            }
                        } catch (Exception unused2) {
                            liteCashInPresenter.navigator.goTo(new FailureMessageBlockerScreen(((PasskeySignatureBlockerScreen) liteCashInPresenter.args).blockersData, z7 ? 1 : 0, z6 ? 1 : 0, i6));
                        }
                        return Unit.INSTANCE;
                    case 20:
                        StatusInterstitialPresenter statusInterstitialPresenter = (StatusInterstitialPresenter) obj2;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i29 = this.label;
                        if (i29 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealBlockersHelper realBlockersHelper3 = statusInterstitialPresenter.blockersHelper;
                            BlockerAction blockerAction4 = statusInterstitialPresenter.args.getStatusInterstitialBlocker().scheduled_action;
                            blockerAction4.getClass();
                            BlockersScreens.StatusInterstitial statusInterstitial = statusInterstitialPresenter.args;
                            this.label = 1;
                            if (BlockersHelper.handleBlockerAction$default(realBlockersHelper3, blockerAction4, statusInterstitial, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons19) {
                                return coroutineSingletons19;
                            }
                        } else {
                            if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 21:
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i30 = this.label;
                        if (i30 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            if (((n) obj2).showAppUpdateDialog(this) == coroutineSingletons20) {
                                return coroutineSingletons20;
                            }
                        } else {
                            if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 22:
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i31 = this.label;
                        if (i31 != 0) {
                            if (i31 == 1) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        MoneyTabPresenter$models$lambda$17$$inlined$map$1 moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(((RealIssuedCardManager) ((InvestingRouter) obj2).cardManager).getIssuedCardOrNull(), i6);
                        this.label = 1;
                        Object first2 = FlowKt.first(moneyTabPresenter$models$lambda$17$$inlined$map$1, this);
                        return first2 == coroutineSingletons21 ? coroutineSingletons21 : first2;
                    case 23:
                        LocalRouter localRouter = (LocalRouter) obj2;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i32 = this.label;
                        if (i32 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealLocalTabProvider realLocalTabProvider = localRouter.localTabProvider;
                            FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new CardModelView$iconTexture$$inlined$map$1(FlowKt.distinctUntilChanged(FlowKt.transformLatest(((RealFeatureFlagManager) realLocalTabProvider.featureFlagManager).peekValues(AmplitudeExperiments$MobileLocalTabVisibility.INSTANCE), new RealPasscodeProvider$getPasscode$1((Continuation) (z9 ? 1 : 0), (Object) realLocalTabProvider, 9))), 25), 1);
                            TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(localRouter, z8 ? 1 : 0, i2);
                            this.label = 1;
                            if (FlowKt.collectLatest(take, temporaryStorage$getDir$2, this) == coroutineSingletons22) {
                                return coroutineSingletons22;
                            }
                        } else {
                            if (i32 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 24:
                        ArcadeShaker arcadeShaker = (ArcadeShaker) obj2;
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i33 = this.label;
                        if (i33 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Animatable animatable = arcadeShaker.shakeOffset;
                            Float f = new Float(arcadeShaker.distance);
                            TweenSpec tween$default = AnimatableKt.tween$default(50, 0, null, 6);
                            this.label = 1;
                            break;
                        } else {
                            if (i33 != 1) {
                                if (i33 == 2) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        Animatable animatable2 = arcadeShaker.shakeOffset;
                        Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                        SpringSpec springSpec = arcadeShaker.spring;
                        this.label = 2;
                        break;
                    case 25:
                        RegularShaker regularShaker = (RegularShaker) obj2;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i34 = this.label;
                        if (i34 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            KeyframesSpec keyframes = AnimatableKt.keyframes(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(regularShaker, i3));
                            ArcadeModal$$ExternalSyntheticLambda5 arcadeModal$$ExternalSyntheticLambda5 = new ArcadeModal$$ExternalSyntheticLambda5(regularShaker, i7);
                            this.label = 1;
                            if (AnimatableKt.animate$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, keyframes, arcadeModal$$ExternalSyntheticLambda5, this, 4) == coroutineSingletons24) {
                                return coroutineSingletons24;
                            }
                        } else {
                            if (i34 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 26:
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i35 = this.label;
                        if (i35 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            if (((PressGestureScopeImpl) obj2).reset(this) == coroutineSingletons25) {
                                return coroutineSingletons25;
                            }
                        } else {
                            if (i35 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    case 27:
                        RealFlowStarter realFlowStarter = (RealFlowStarter) obj2;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i36 = this.label;
                        if (i36 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            JobImpl jobImpl = realFlowStarter.blockersConfigReady;
                            this.label = 1;
                            break;
                        } else {
                            if (i36 != 1) {
                                if (i36 == 2) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        JobImpl jobImpl2 = realFlowStarter.instrumentLinkingConfigReady;
                        this.label = 2;
                        break;
                    case 28:
                        RealContactSyncEventAggregator realContactSyncEventAggregator = (RealContactSyncEventAggregator) obj2;
                        Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i37 = this.label;
                        if (i37 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealContactBook realContactBook = realContactSyncEventAggregator.contactBook;
                            Flow flow3 = realContactBook.detailedContacts;
                            Flow flow4 = realContactBook.contactAccounts;
                            AnonymousClass4 anonymousClass4 = new AnonymousClass4(3, continuation, i6);
                            PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1(realContactSyncEventAggregator.events, i4);
                            this.label = 1;
                            Object coroutineScope = JobKt.coroutineScope(new CombineKt$zipImpl$1$1(flow4, flow3, paymentPasscodeActivity$loadView$3$1, anonymousClass4, null), this);
                            Object obj8 = coroutineScope;
                            if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj8 = Unit.INSTANCE;
                            }
                            if (obj8 == obj7) {
                                return obj7;
                            }
                        } else {
                            if (i37 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    default:
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i38 = this.label;
                        if (i38 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            RealContactSyncRoutineAggregator realContactSyncRoutineAggregator = (RealContactSyncRoutineAggregator) obj2;
                            Channel channel = realContactSyncRoutineAggregator.events;
                            ContactSyncEvent.SyncRoutines syncRoutines = new ContactSyncEvent.SyncRoutines(realContactSyncRoutineAggregator.contactDatabaseRoutine, realContactSyncRoutineAggregator.contactsSyncToServerRoutine, realContactSyncRoutineAggregator.detailedContactsSyncEncryptedRoutine);
                            this.label = 1;
                            if (channel.send(syncRoutines, this) == coroutineSingletons27) {
                                return coroutineSingletons27;
                            }
                        } else {
                            if (i38 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                }
            }
        }

        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$1$5, reason: invalid class name */
        public final class AnonymousClass5 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ CardModelView this$0;

            public /* synthetic */ AnonymousClass5(CardModelView cardModelView, int i) {
                this.$r8$classId = i;
                this.this$0 = cardModelView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Pair pair;
                Pair pair2;
                Texture texture;
                int i = this.$r8$classId;
                CardModelView cardModelView = this.this$0;
                switch (i) {
                    case 0:
                        ViewModel viewModel = (ViewModel) ((Quadruple) obj).first;
                        TextureSampler textureSampler = cardModelView.sampler;
                        TextureSampler textureSampler2 = cardModelView.shimmerSampler;
                        Iterator it = ArraysKt___ArraysKt.filterNotNull(new MaterialInstance[]{cardModelView.materialInstance, cardModelView.materialInstanceBack}).iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            float f = RecyclerView.DECELERATION_RATE;
                            if (!hasNext) {
                                CardContouredText cardContouredText = viewModel.contouredText;
                                MaterialInstance materialInstance = cardModelView.textMaterialInstance;
                                if (materialInstance != null) {
                                    if (cardContouredText != null) {
                                        f = cardContouredText.opacity;
                                    }
                                    materialInstance.setParameter("opacity", f);
                                    CardTextureState cardTextureState = cardModelView.textureState;
                                    if (cardTextureState == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                        throw null;
                                    }
                                    Pair pair3 = cardTextureState.contouredTextTexture;
                                    r8 = pair3 != null ? (Texture) pair3.second : null;
                                    if (r8 != null) {
                                        materialInstance.setParameter("albedo", r8, textureSampler2);
                                    }
                                    if (cardContouredText != null) {
                                        materialInstance.setParameter("textureScale", cardContouredText.repeatCount, 1.0f);
                                    }
                                }
                                cardModelView.scheduleRedraw();
                                cardModelView.cardInitialized = true;
                                return Unit.INSTANCE;
                            }
                            MaterialInstance materialInstance2 = (MaterialInstance) it.next();
                            CardTextureState cardTextureState2 = cardModelView.textureState;
                            if (cardTextureState2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair4 = cardTextureState2.albedoTexture;
                            Texture texture2 = pair4 != null ? (Texture) pair4.second : null;
                            texture2.getClass();
                            materialInstance2.setParameter("albedo", texture2, textureSampler);
                            CardTextureState cardTextureState3 = cardModelView.textureState;
                            if (cardTextureState3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair5 = cardTextureState3.normalTexture;
                            Texture texture3 = pair5 != null ? (Texture) pair5.second : null;
                            texture3.getClass();
                            materialInstance2.setParameter("normal", texture3, textureSampler);
                            CardTextureState cardTextureState4 = cardModelView.textureState;
                            if (cardTextureState4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair6 = cardTextureState4.inkTexture;
                            Texture texture4 = pair6 != null ? (Texture) pair6.second : null;
                            texture4.getClass();
                            materialInstance2.setParameter("inkMetalHeat", texture4, textureSampler);
                            CardTextureState cardTextureState5 = cardModelView.textureState;
                            if (cardTextureState5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair7 = cardTextureState5.heatTexture;
                            Texture texture5 = pair7 != null ? (Texture) pair7.second : null;
                            texture5.getClass();
                            materialInstance2.setParameter("heatColors", texture5, textureSampler);
                            CardTextureState cardTextureState6 = cardModelView.textureState;
                            if (cardTextureState6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair8 = cardTextureState6.heatMaskTexture;
                            pair8.getClass();
                            materialInstance2.setParameter("heatMask", (Texture) pair8.second, textureSampler);
                            CardTextureState cardTextureState7 = cardModelView.textureState;
                            if (cardTextureState7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Texture texture6 = cardTextureState7.shimmerTexture;
                            texture6.getClass();
                            materialInstance2.setParameter("shimmerGradient", texture6, textureSampler2);
                            materialInstance2.setParameter("roughness", viewModel.roughness);
                            materialInstance2.setParameter("clearCoat", viewModel.clearCoat);
                            materialInstance2.setParameter("clearCoatRoughness", viewModel.clearCoatRoughness);
                            materialInstance2.setParameter("inkRoughness", viewModel.inkRoughness);
                            materialInstance2.setParameter("inkClearCoat", viewModel.inkClearCoat);
                            materialInstance2.setParameter("inkClearCoatRoughness", viewModel.inkClearCoatRoughness);
                            materialInstance2.setParameter("metallic", viewModel.metallic);
                            materialInstance2.setParameter("metallicRoughness", viewModel.metallicRoughness);
                            materialInstance2.setParameter("metallicClearCoat", viewModel.metallicClearCoat);
                            materialInstance2.setParameter("metallicClearCoatRoughness", viewModel.metallicClearCoatRoughness);
                            materialInstance2.setParameter("opacity", viewModel.opacity);
                            materialInstance2.setParameter("glitterRoughness", RecyclerView.DECELERATION_RATE);
                            materialInstance2.setParameter("dimmer", viewModel.dimmer);
                            materialInstance2.setParameter("shimmerOffset", viewModel.shimmerOffset);
                            materialInstance2.setParameter("shimmerScale", viewModel.shimmerScale);
                            materialInstance2.setParameter("holoOffsetScale", viewModel.holoOffsetScale);
                            materialInstance2.setParameter("holoOffsetX", viewModel.holoOffsetX);
                            materialInstance2.setParameter("holoOffsetY", viewModel.holoOffsetY);
                            CardTextureState cardTextureState8 = cardModelView.textureState;
                            if (cardTextureState8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair9 = cardTextureState8.iconTexture;
                            if (pair9 != null && (texture = (Texture) pair9.second) != null) {
                                materialInstance2.setParameter("iconSampler", texture, textureSampler);
                            }
                            RectF rectF = CardsKt.ICON_TEXTURE_BOUNDS;
                            materialInstance2.setParameter(rectF.left, rectF.top, rectF.width(), rectF.height());
                            materialInstance2.setParameter("indicatorRadius", cardModelView.indicatorRadius);
                            CardTextureState cardTextureState9 = cardModelView.textureState;
                            if (cardTextureState9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair10 = cardTextureState9.holoTextures;
                            Texture texture7 = (pair10 == null || (pair2 = (Pair) pair10.second) == null) ? null : (Texture) pair2.first;
                            texture7.getClass();
                            materialInstance2.setParameter("holoBase", texture7, textureSampler);
                            CardTextureState cardTextureState10 = cardModelView.textureState;
                            if (cardTextureState10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                                throw null;
                            }
                            Pair pair11 = cardTextureState10.holoTextures;
                            if (pair11 != null && (pair = (Pair) pair11.second) != null) {
                                r8 = (Texture) pair.second;
                            }
                            r8.getClass();
                            materialInstance2.setParameter("holoReflect", r8, textureSampler);
                            materialInstance2.setParameter(viewModel.id == CardTheme.Identifier.HOLO_ID);
                            CardModelView.setParameterColor(materialInstance2, "indicatorColor", cardModelView.indicatorColor, true);
                            CardModelView.setParameterColor(materialInstance2, "baseColor", viewModel.color, false);
                            CardModelView.setParameterColor(materialInstance2, "inkColor", viewModel.inkColor, false);
                            CardModelView.setParameterColor(materialInstance2, "backInkColor", viewModel.backInkColor, false);
                            CardModelView.setParameterColor(materialInstance2, "magStripeColor", viewModel.magStripColor, false);
                            CardModelView.setParameterColor(materialInstance2, "backMagStripeColor", viewModel.backMagStripColor, false);
                        }
                        break;
                    default:
                        cardModelView.scheduleRedraw();
                        return Unit.INSTANCE;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, CardModelView cardModelView, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = cardModelView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            CardModelView cardModelView = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, cardModelView, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 1:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(1, cardModelView, continuation);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 2:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(2, cardModelView, continuation);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 3:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(3, cardModelView, continuation);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 4:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(4, cardModelView, continuation);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                default:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1(5, cardModelView, continuation);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create((CardRegistry.SharedCardTransitionState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
        
            if (r1.emit(r2, r21) == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00e3, code lost:
        
            if (r1.emit(r6, r21) == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
        
            if (r2 == r4) goto L58;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object withContext;
            Texture createTexture;
            int i = this.$r8$classId;
            int i2 = 10;
            int i3 = 3;
            int i4 = 0;
            CardModelView cardModelView = this.this$0;
            int i5 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        JobKt.launch$default(coroutineScope, null, null, new C00581(cardModelView, continuation, i4), 3);
                        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(i5, cardModelView, continuation), 3);
                        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(21, FlowKt.transformLatest(FlowKt.receiveAsFlow(cardModelView.engineAttachedEvent), new CardModelView$cardHeat$$inlined$flatMapLatest$1(i5, cardModelView, continuation)), new AnonymousClass4(cardModelView, continuation, i4));
                        AnonymousClass5 anonymousClass5 = new AnonymousClass5(cardModelView, i4);
                        this.L$0 = null;
                        this.label = 1;
                        if (finishSetupTileBadgeCounter.collect(anonymousClass5, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                        MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = new MaterialButton$$ExternalSyntheticLambda3(coroutineScope2, 18);
                        SsnViewKt$$ExternalSyntheticLambda4 ssnViewKt$$ExternalSyntheticLambda4 = new SsnViewKt$$ExternalSyntheticLambda4(ref$FloatRef, i2);
                        CardModelView cardModelView2 = this.this$0;
                        ContouredMarquee contouredMarquee = new ContouredMarquee(materialButton$$ExternalSyntheticLambda3, ssnViewKt$$ExternalSyntheticLambda4, new BorrowHomeKt$$ExternalSyntheticLambda1(8, ref$FloatRef, cardModelView2), new WandScene$ring$3(0, cardModelView2, CardModelView.class, "scheduleRedraw", "scheduleRedraw()V", 0, 12), 16L);
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(cardModelView2.viewmodels, 24), i3));
                        CardModelView$1$2$2 cardModelView$1$2$2 = new CardModelView$1$2$2(contouredMarquee, i4);
                        this.L$0 = null;
                        this.label = 1;
                        if (distinctUntilChanged.collect(cardModelView$1$2$2, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CardTextureState cardTextureState = cardModelView.textureState;
                        if (cardTextureState == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textureState");
                            throw null;
                        }
                        Texture texture = cardTextureState.shimmerTexture;
                        if (texture == null) {
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                            TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(cardModelView, continuation, i2);
                            this.L$0 = flowCollector;
                            this.label = 2;
                            withContext = JobKt.withContext(defaultIoScheduler, temporaryStorage$getDir$2, this);
                            break;
                        } else {
                            this.L$0 = null;
                            this.label = 1;
                            break;
                        }
                        return coroutineSingletons3;
                    }
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i8 != 2) {
                        if (i8 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                    TextureType textureType = TextureType.COLOR;
                    createTexture = cardModelView.createTexture(255, (Bitmap) withContext, TextureType.COLOR);
                    CardTextureState cardTextureState2 = cardModelView.textureState;
                    if (cardTextureState2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    cardTextureState2.shimmerTexture = createTexture;
                    this.L$0 = null;
                    this.label = 3;
                    break;
                case 3:
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Quadruple quadruple = new Quadruple(cardModelView.readMaterial("cash_card_pbr"), cardModelView.readMaterial("copy_pan_flat"), cardModelView.readMesh("cash_card"), cardModelView.readMesh("cash_card_text"));
                        this.L$0 = null;
                        this.label = 1;
                        if (flowCollector2.emit(quadruple, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) this.L$0;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Hero3DCardViewKt$InteractiveCard$6$1$2$2$1 hero3DCardViewKt$InteractiveCard$6$1$2$2$1 = new Hero3DCardViewKt$InteractiveCard$6$1$2$2$1(sharedCardTransitionState, cardModelView, continuation, i4);
                        this.L$0 = null;
                        this.label = 1;
                        if (JobKt.coroutineScope(hero3DCardViewKt$InteractiveCard$6$1$2$2$1, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CardRegistry.SharedCardTransitionState sharedCardTransitionState2 = (CardRegistry.SharedCardTransitionState) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Hero3DCardViewKt$InteractiveCard$6$1$2$2$1 hero3DCardViewKt$InteractiveCard$6$1$2$2$12 = new Hero3DCardViewKt$InteractiveCard$6$1$2$2$1(sharedCardTransitionState2, cardModelView, continuation, i5);
                        this.L$0 = null;
                        this.label = 1;
                        if (JobKt.coroutineScope(hero3DCardViewKt$InteractiveCard$6$1$2$2$12, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends SuspendLambda implements Function3 {
            public final /* synthetic */ int $r8$classId;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4() {
                super(3, null);
                this.$r8$classId = 13;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 3;
                switch (this.$r8$classId) {
                    case 0:
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4((CardModelView) this.this$0, (Continuation) obj3, 0);
                        anonymousClass4.L$0 = (Throwable) obj2;
                        return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                    case 1:
                        AnonymousClass4 anonymousClass42 = new AnonymousClass4((PipeCameraPresenceSource) this.this$0, (Continuation) obj3, 1);
                        anonymousClass42.L$0 = (Throwable) obj2;
                        return anonymousClass42.invokeSuspend(Unit.INSTANCE);
                    case 2:
                        AnonymousClass4 anonymousClass43 = new AnonymousClass4(i, (Continuation) obj3, 2);
                        anonymousClass43.L$0 = (ImplementationMode) obj;
                        anonymousClass43.this$0 = (AutoValue_SurfaceRequest_TransformationInfo) obj2;
                        return anonymousClass43.invokeSuspend(Unit.INSTANCE);
                    case 3:
                        AnonymousClass4 anonymousClass44 = new AnonymousClass4(i, (Continuation) obj3, i);
                        anonymousClass44.L$0 = (AfterpayApplet) obj;
                        anonymousClass44.this$0 = (AfterpayAppletResponse) obj2;
                        return anonymousClass44.invokeSuspend(Unit.INSTANCE);
                    case 4:
                        AnonymousClass4 anonymousClass45 = new AnonymousClass4(i, (Continuation) obj3, 4);
                        anonymousClass45.L$0 = (Set) obj;
                        anonymousClass45.this$0 = (FamilyProfile) obj2;
                        return anonymousClass45.invokeSuspend(Unit.INSTANCE);
                    case 5:
                        AnonymousClass4 anonymousClass46 = new AnonymousClass4(i, (Continuation) obj3, 5);
                        anonymousClass46.L$0 = (BitcoinPayInUsdPreference) obj;
                        anonymousClass46.this$0 = (BitcoinPayInUsdPreference) obj2;
                        return anonymousClass46.invokeSuspend(Unit.INSTANCE);
                    case 6:
                        AnonymousClass4 anonymousClass47 = new AnonymousClass4(i, (Continuation) obj3, 6);
                        anonymousClass47.L$0 = (ContactBook$DetailedContactQuery) obj;
                        anonymousClass47.this$0 = (ContactBook$ContactAccountDetailsQuery) obj2;
                        return anonymousClass47.invokeSuspend(Unit.INSTANCE);
                    case 7:
                        AnonymousClass4 anonymousClass48 = new AnonymousClass4(i, (Continuation) obj3, 7);
                        anonymousClass48.L$0 = (EarningsHomeUiChartState) obj;
                        anonymousClass48.this$0 = (EarningsHomeUIState) obj2;
                        return anonymousClass48.invokeSuspend(Unit.INSTANCE);
                    case 8:
                        ((Boolean) obj2).getClass();
                        AnonymousClass4 anonymousClass49 = new AnonymousClass4((MutableState) this.this$0, (Continuation) obj3, 8);
                        anonymousClass49.L$0 = (Region) obj;
                        return anonymousClass49.invokeSuspend(Unit.INSTANCE);
                    case 9:
                        AnonymousClass4 anonymousClass410 = new AnonymousClass4(i, (Continuation) obj3, 9);
                        anonymousClass410.L$0 = (GraphPresenterData) obj;
                        anonymousClass410.this$0 = (GraphPresenterData) obj2;
                        return anonymousClass410.invokeSuspend(Unit.INSTANCE);
                    case 10:
                        AnonymousClass4 anonymousClass411 = new AnonymousClass4(i, (Continuation) obj3, 10);
                        anonymousClass411.L$0 = (String) obj;
                        anonymousClass411.this$0 = (List) obj2;
                        return anonymousClass411.invokeSuspend(Unit.INSTANCE);
                    case 11:
                        AnonymousClass4 anonymousClass412 = new AnonymousClass4(i, (Continuation) obj3, 11);
                        anonymousClass412.L$0 = (String) obj;
                        anonymousClass412.this$0 = (InviteContactsViewModel.RecommendedContacts) obj2;
                        return anonymousClass412.invokeSuspend(Unit.INSTANCE);
                    case 12:
                        AnonymousClass4 anonymousClass413 = new AnonymousClass4((MutableState) this.this$0, (Continuation) obj3, 12);
                        anonymousClass413.L$0 = (GoogleMap) obj2;
                        return anonymousClass413.invokeSuspend(Unit.INSTANCE);
                    case 13:
                        AnonymousClass4 anonymousClass414 = new AnonymousClass4(i, (Continuation) obj3, 13);
                        anonymousClass414.L$0 = (OffersSearch) obj;
                        anonymousClass414.this$0 = (OffersSearch) obj2;
                        return anonymousClass414.invokeSuspend(Unit.INSTANCE);
                    case 14:
                        AnonymousClass4 anonymousClass415 = new AnonymousClass4(i, (Continuation) obj3, 14);
                        anonymousClass415.L$0 = (P2PControl) obj;
                        anonymousClass415.this$0 = (List) obj2;
                        return anonymousClass415.invokeSuspend(Unit.INSTANCE);
                    case 15:
                        AnonymousClass4 anonymousClass416 = new AnonymousClass4(i, (Continuation) obj3, 15);
                        anonymousClass416.L$0 = (FxExchangeRates) obj;
                        anonymousClass416.this$0 = (FxExchangeRate) obj2;
                        return anonymousClass416.invokeSuspend(Unit.INSTANCE);
                    case 16:
                        AnonymousClass4 anonymousClass417 = new AnonymousClass4(i, (Continuation) obj3, 16);
                        anonymousClass417.L$0 = (ShareableAssetsManager$ShareableAssets) obj;
                        anonymousClass417.this$0 = (ShareableAssetsManager$ShareableAssets) obj2;
                        return anonymousClass417.invokeSuspend(Unit.INSTANCE);
                    case 17:
                        AnonymousClass4 anonymousClass418 = new AnonymousClass4(i, (Continuation) obj3, 17);
                        anonymousClass418.L$0 = (PagingDataWithCount) obj;
                        anonymousClass418.this$0 = (PagingDataWithCount) obj2;
                        return anonymousClass418.invokeSuspend(Unit.INSTANCE);
                    case 18:
                        AnonymousClass4 anonymousClass419 = new AnonymousClass4(i, (Continuation) obj3, 18);
                        anonymousClass419.L$0 = (Money) obj;
                        anonymousClass419.this$0 = (ExchangeData) obj2;
                        return anonymousClass419.invokeSuspend(Unit.INSTANCE);
                    case 19:
                        AnonymousClass4 anonymousClass420 = new AnonymousClass4(i, (Continuation) obj3, 19);
                        anonymousClass420.L$0 = (List) obj;
                        anonymousClass420.this$0 = (Disclosure) obj2;
                        return anonymousClass420.invokeSuspend(Unit.INSTANCE);
                    default:
                        AnonymousClass4 anonymousClass421 = new AnonymousClass4(i, (Continuation) obj3, 20);
                        anonymousClass421.L$0 = (MerchantIdentifier) obj;
                        anonymousClass421.this$0 = (List) obj2;
                        return anonymousClass421.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:153:0x0264  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x027b  */
            /* JADX WARN: Removed duplicated region for block: B:171:0x027d  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0278 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean z;
                Iterator<E> it;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                boolean z2 = true;
                switch (this.$r8$classId) {
                    case 0:
                        Throwable th = (Throwable) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        GraphicsError graphicsError = new GraphicsError(th);
                        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                        if (errorReporter == null) {
                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                            return null;
                        }
                        errorReporter.report(graphicsError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        Function0 function0 = ((CardModelView) this.this$0).onError;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        Throwable th2 = (Throwable) this.L$0;
                        Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th2);
                        PipeCameraPresenceSource pipeCameraPresenceSource = (PipeCameraPresenceSource) this.this$0;
                        if (pipeCameraPresenceSource.isMonitoring.get()) {
                            pipeCameraPresenceSource.updateState(null, th2);
                        } else {
                            Okio.boxInt(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                        }
                        return Unit.INSTANCE;
                    case 2:
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new Pair((ImplementationMode) this.L$0, (AutoValue_SurfaceRequest_TransformationInfo) this.this$0);
                    case 3:
                        AfterpayApplet afterpayApplet = (AfterpayApplet) this.L$0;
                        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) this.this$0;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new Pair(afterpayApplet, afterpayAppletResponse);
                    case 4:
                        Set set = (Set) this.L$0;
                        FamilyProfile familyProfile = (FamilyProfile) this.this$0;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return ((familyProfile instanceof FamilyProfile.ManagedAccount) || !set.contains(EligibleFeature.MONEY_BTC_APPLET)) ? AppletAvailabilityState.UNAVAILABLE : AppletAvailabilityState.AVAILABLE;
                    case 5:
                        BitcoinPayInUsdPreference bitcoinPayInUsdPreference = (BitcoinPayInUsdPreference) this.L$0;
                        BitcoinPayInUsdPreference bitcoinPayInUsdPreference2 = (BitcoinPayInUsdPreference) this.this$0;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new Pair(bitcoinPayInUsdPreference, bitcoinPayInUsdPreference2);
                    case 6:
                        ContactBook$DetailedContactQuery contactBook$DetailedContactQuery = (ContactBook$DetailedContactQuery) this.L$0;
                        ContactBook$ContactAccountDetailsQuery contactBook$ContactAccountDetailsQuery = (ContactBook$ContactAccountDetailsQuery) this.this$0;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new ContactSyncEvent.NewContacts(contactBook$DetailedContactQuery, contactBook$ContactAccountDetailsQuery);
                    case 7:
                        EarningsHomeUiChartState earningsHomeUiChartState = (EarningsHomeUiChartState) this.L$0;
                        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) this.this$0;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        boolean z3 = earningsHomeUiChartState.shouldShowChart;
                        if (earningsHomeUIState != null) {
                            z3 = !Intrinsics.areEqual(earningsHomeUIState.should_show_chart, Boolean.FALSE);
                        }
                        if (!earningsHomeUiChartState.hasSeenHomeUiState && earningsHomeUIState == null) {
                            z2 = false;
                        }
                        return new EarningsHomeUiChartState(earningsHomeUIState, z3, z2);
                    case 8:
                        Region region = (Region) this.L$0;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new Pair((InputFieldText) ((MutableState) this.this$0).getValue(), region);
                    case 9:
                        GraphPresenterData graphPresenterData = (GraphPresenterData) this.L$0;
                        GraphPresenterData graphPresenterData2 = (GraphPresenterData) this.this$0;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (!(graphPresenterData2.contentModel instanceof InvestingGraphContentModel.Loading)) {
                            return graphPresenterData2;
                        }
                        InvestingGraphContentModel investingGraphContentModel = graphPresenterData.contentModel;
                        if (!(investingGraphContentModel instanceof InvestingGraphContentModel.Loaded)) {
                            return graphPresenterData2;
                        }
                        InvestingGraphContentModel.Loaded loaded = (InvestingGraphContentModel.Loaded) investingGraphContentModel;
                        return GraphPresenterData.copy$default(graphPresenterData, null, new InvestingGraphContentModel.Loading(loaded.points, loaded.smoothedPoints, loaded.graphWidth, loaded.minimumHeightRange, loaded.accentColor), 11);
                    case 10:
                        String str = (String) this.L$0;
                        List list = (List) this.this$0;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (str.length() == 0) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj6 : list) {
                                InviteContactsViewModel.Contact contact = (InviteContactsViewModel.Contact) obj6;
                                int ordinal = contact.status.ordinal();
                                if (ordinal == 0) {
                                    Iterator<E> it2 = contact.recipients.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj4 = it2.next();
                                            if (((Recipient) obj4).sms != null) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    if (obj4 != null) {
                                    }
                                } else if (ordinal != 1 && ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                arrayList.add(obj6);
                            }
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder();
                        int length = str.length();
                        for (int i = 0; i < length; i++) {
                            char charAt = str.charAt(i);
                            if (Character.isDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        String sb2 = sb.toString();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : list) {
                            InviteContactsViewModel.Contact contact2 = (InviteContactsViewModel.Contact) obj7;
                            String displayName = contact2.getDisplayName();
                            ImmutableList immutableList = contact2.recipients;
                            boolean contains = displayName != null ? StringsKt.contains((CharSequence) displayName, (CharSequence) str, true) : false;
                            if (sb2.length() > 0) {
                                Iterator<E> it3 = immutableList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        String str2 = ((Recipient) obj3).sms;
                                        if (str2 != null ? StringsKt.contains((CharSequence) str2, (CharSequence) sb2, false) : false) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                if (obj3 != null) {
                                    z = true;
                                    it = immutableList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = null;
                                        } else {
                                            obj2 = it.next();
                                            String str3 = ((Recipient) obj2).email;
                                            if (str3 != null ? StringsKt.contains((CharSequence) str3, (CharSequence) str, false) : false) {
                                            }
                                        }
                                    }
                                    boolean z4 = obj2 == null;
                                    if (!contains || z || z4) {
                                        arrayList2.add(obj7);
                                    }
                                }
                            }
                            z = false;
                            it = immutableList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            if (obj2 == null) {
                            }
                            if (!contains) {
                            }
                            arrayList2.add(obj7);
                        }
                        return arrayList2;
                    case 11:
                        String str4 = (String) this.L$0;
                        InviteContactsViewModel.RecommendedContacts recommendedContacts = (InviteContactsViewModel.RecommendedContacts) this.this$0;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return str4.length() > 0 ? EmptyList.INSTANCE : recommendedContacts.recommendations;
                    case 12:
                        GoogleMap googleMap = (GoogleMap) this.L$0;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ((MutableState) this.this$0).setValue(googleMap);
                        return Unit.INSTANCE;
                    case 13:
                        OffersSearch offersSearch = (OffersSearch) this.L$0;
                        OffersSearch offersSearch2 = (OffersSearch) this.this$0;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return (offersSearch != null ? offersSearch.last_updated : 0L) > (offersSearch2 != null ? offersSearch2.last_updated : 0L) ? offersSearch : offersSearch2;
                    case 14:
                        P2PControl p2PControl = (P2PControl) this.L$0;
                        List list2 = (List) this.this$0;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return p2PControl != null ? Intrinsics.areEqual(p2PControl.enabled, Boolean.FALSE) : false ? CollectionsKt.toSet(CollectionsKt.filterNotNull(list2)) : EmptySet.INSTANCE;
                    case 15:
                        FxExchangeRates fxExchangeRates = (FxExchangeRates) this.L$0;
                        FxExchangeRate fxExchangeRate = (FxExchangeRate) this.this$0;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new FxExchangeRates(fxExchangeRate, fxExchangeRate == null ? fxExchangeRates.lastAvailable : fxExchangeRate);
                    case 16:
                        ShareableAssetsManager$ShareableAssets shareableAssetsManager$ShareableAssets = (ShareableAssetsManager$ShareableAssets) this.L$0;
                        ShareableAssetsManager$ShareableAssets shareableAssetsManager$ShareableAssets2 = (ShareableAssetsManager$ShareableAssets) this.this$0;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        String str5 = shareableAssetsManager$ShareableAssets2.cashtagUrl;
                        if (str5 == null) {
                            str5 = shareableAssetsManager$ShareableAssets.cashtagUrl;
                        }
                        ShareableAssetsManager$DownloadedImage shareableAssetsManager$DownloadedImage = shareableAssetsManager$ShareableAssets2.printableCashtagQrImage;
                        if (shareableAssetsManager$DownloadedImage == null) {
                            shareableAssetsManager$DownloadedImage = shareableAssetsManager$ShareableAssets.printableCashtagQrImage;
                        }
                        shareableAssetsManager$ShareableAssets.getClass();
                        return new ShareableAssetsManager$ShareableAssets(str5, shareableAssetsManager$DownloadedImage);
                    case 17:
                        PagingDataWithCount pagingDataWithCount = (PagingDataWithCount) this.L$0;
                        PagingDataWithCount pagingDataWithCount2 = (PagingDataWithCount) this.this$0;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new PagedTransactions(pagingDataWithCount.value, pagingDataWithCount.count, pagingDataWithCount2.value, pagingDataWithCount2.count);
                    case 18:
                        Money money = (Money) this.L$0;
                        ExchangeData exchangeData = (ExchangeData) this.this$0;
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        Iterator it4 = exchangeData.rates.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj5 = it4.next();
                                if (((ExchangeRate) obj5).currency_code == money.currency_code) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        ExchangeRate exchangeRate = (ExchangeRate) obj5;
                        if ((exchangeRate != null ? exchangeRate.base_value_cents : null) == null || money.amount == null) {
                            return money;
                        }
                        long j = money.currency_code == CurrencyCode.BTC ? 100000000L : 1L;
                        Long l = money.amount;
                        l.getClass();
                        long longValue = l.longValue();
                        Long l2 = exchangeRate.base_value_cents;
                        l2.getClass();
                        return new Money(new Long((l2.longValue() * longValue) / j), exchangeData.base_currency_code, 4);
                    case 19:
                        List list3 = (List) this.L$0;
                        Disclosure disclosure = (Disclosure) this.this$0;
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        return new Pair(list3, disclosure);
                    default:
                        MerchantIdentifier merchantIdentifier = (MerchantIdentifier) this.L$0;
                        List list4 = (List) this.this$0;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        for (Object obj8 : list4) {
                            MerchantIdentifier identifier = LocalPresenterFactoryKt.getIdentifier((Merchant) obj8);
                            if (Intrinsics.areEqual(identifier != null ? identifier.token : null, merchantIdentifier != null ? merchantIdentifier.token : null)) {
                                return obj8;
                            }
                        }
                        return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass4(int i, Continuation continuation, int i2) {
                super(i, continuation);
                this.$r8$classId = i2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass4(Object obj, Continuation continuation, int i) {
                super(3, continuation);
                this.$r8$classId = i;
                this.this$0 = obj;
            }
        }
    }
}
