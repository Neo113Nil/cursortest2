package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import app.cash.arcade.values.TextFieldState;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.dialog.AddressSelectionDialog;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.core.apiclientv2.APIEndpoint;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.ConsumerAPIClientParams;
import com.fillr.core.apiclientv2.ConsumerAPIClientTask;
import com.fillr.core.apiclientv2.Repository;
import com.fillr.core.model.FillrAddressQueryResult;
import com.fillr.profile.InputFragmentDialog;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.fillr.profile.adapter.HelperElement;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.tasks.zzb;
import com.google.android.libraries.places.internal.zznv;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.treehouse.LegacyScaffoldBinding;
import com.squareup.cash.arcade.treehouse.ScaffoldBinding;
import com.squareup.cash.arcade.treehouse.SearchFieldBinding;
import com.squareup.cash.arcade.treehouse.TextFieldBinding;
import com.squareup.cash.blockers.views.CardActivationView;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.google.pay.GooglePayActivationView;
import com.squareup.cash.google.pay.GooglePayCompleteProvisioningView;
import com.squareup.cash.investing.components.InvestingMetricView;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView;
import com.squareup.cash.mooncake.components.LoadingHelper$Position;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.mooncake.components.MooncakeSearchTextField;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.security.views.PasswordEntryView;
import com.squareup.cash.support.chat.views.ChatView;
import com.squareup.cash.support.chat.views.transcript.TranscriptRecyclerView;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.android.Views;
import com.squareup.util.android.layout.Anchor;
import com.squareup.util.android.layout.LayoutHelpersKt;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.HelperFunctions;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.ElementType;
import net.oneformapp.schema.Schema_;

/* loaded from: classes3.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Bundle mAppSearchData;
    public boolean mClearingFocus;
    public final ImageView mCloseButton;
    public final ImageView mCollapsedIcon;
    public int mCollapsedImeOptions;
    public final CharSequence mDefaultQueryHint;
    public final View mDropDownAnchor;
    public boolean mExpandedInActionView;
    public final ImageView mGoButton;
    public boolean mIconified;
    public boolean mIconifiedByDefault;
    public int mMaxWidth;
    public View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    public View.OnClickListener mOnSearchClickListener;
    public final WeakHashMap mOutsideDrawablesCache;
    public CharSequence mQueryHint;
    public boolean mQueryRefinement;
    public final AnonymousClass1 mReleaseCursorRunnable;
    public final ImageView mSearchButton;
    public final View mSearchEditFrame;
    public final Drawable mSearchHintIcon;
    public final View mSearchPlate;
    public final SearchAutoComplete mSearchSrcTextView;
    public final Rect mSearchSrcTextViewBounds;
    public final Rect mSearchSrtTextViewBoundsExpanded;
    public SearchableInfo mSearchable;
    public final View mSubmitArea;
    public boolean mSubmitButtonEnabled;
    public final int mSuggestionCommitIconResId;
    public final int mSuggestionRowLayout;
    public CursorAdapter mSuggestionsAdapter;
    public final int[] mTemp;
    public final int[] mTemp2;
    public UpdatableTouchDelegate mTouchDelegate;
    public final AnonymousClass1 mUpdateDrawableStateRunnable;
    public CharSequence mUserQuery;
    public final Intent mVoiceAppSearchIntent;
    public final ImageView mVoiceButton;
    public boolean mVoiceButtonEnabled;
    public final Intent mVoiceWebSearchIntent;

    /* renamed from: androidx.appcompat.widget.SearchView$10, reason: invalid class name */
    public final class AnonymousClass10 implements TextWatcher {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass10(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void afterTextChanged$androidx$appcompat$widget$SearchView$10(Editable editable) {
        }

        private final void afterTextChanged$com$google$android$material$search$SearchView$2(Editable editable) {
        }

        private final void afterTextChanged$com$squareup$cash$arcade$treehouse$SearchFieldBinding$special$$inlined$addTextChangedListener$default$1(Editable editable) {
        }

        private final void afterTextChanged$com$squareup$cash$arcade$treehouse$TextFieldBinding$special$$inlined$addTextChangedListener$default$1(Editable editable) {
        }

        private final void afterTextChanged$com$squareup$cash$mooncake$components$MooncakeSearchTextField$special$$inlined$doOnTextChangedWithInitial$1(Editable editable) {
        }

        private final void afterTextChanged$com$squareup$cash$security$views$PasswordEntryView$setupPasswordInput$lambda$0$$inlined$doOnTextChanged$1(Editable editable) {
        }

        private final void afterTextChanged$com$squareup$util$android$TextViewsKt$textChanges$1$invokeSuspend$$inlined$doOnTextChanged$1(Editable editable) {
        }

        private final void beforeTextChanged$androidx$appcompat$widget$SearchView$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$fillr$browsersdk$adapters$FillrBaseAdapter$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$google$android$libraries$places$widget$internal$autocomplete$ui$zzac(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$google$android$libraries$places$widget$internal$autocomplete$ui$zzk(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$google$android$material$search$SearchView$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$squareup$cash$arcade$treehouse$SearchFieldBinding$special$$inlined$addTextChangedListener$default$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$squareup$cash$arcade$treehouse$TextFieldBinding$special$$inlined$addTextChangedListener$default$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$squareup$cash$mooncake$components$MooncakeSearchTextField$special$$inlined$doOnTextChangedWithInitial$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$squareup$cash$security$views$PasswordEntryView$setupPasswordInput$lambda$0$$inlined$doOnTextChanged$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$squareup$util$android$TextViewsKt$textChanges$1$invokeSuspend$$inlined$doOnTextChanged$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$squareup$workflow1$ui$TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$2$textWatcher$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$withpersona$sdk2$inquiry$steps$ui$components$InputNumberComponentKt$makeView$lambda$7$$inlined$doAfterTextChanged$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$com$withpersona$sdk2$inquiry$steps$ui$inputSelect$InputSelectBottomSheetController$show$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$com$fillr$browsersdk$adapters$FillrBaseAdapter$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$com$google$android$libraries$places$widget$internal$autocomplete$ui$zzac(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$com$google$android$libraries$places$widget$internal$autocomplete$ui$zzk(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$com$withpersona$sdk2$inquiry$steps$ui$components$InputNumberComponentKt$makeView$lambda$7$$inlined$doAfterTextChanged$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$com$withpersona$sdk2$inquiry$steps$ui$inputSelect$InputSelectBottomSheetController$show$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String obj;
            int i = this.$r8$classId;
            Double d = null;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return;
                case 1:
                    ProfileAdapter profileAdapter = (ProfileAdapter) obj2;
                    profileAdapter.validateEditText(profileAdapter.currentEditingTextView, editable);
                    return;
                case 2:
                    try {
                        BaseAutocompleteImplFragment baseAutocompleteImplFragment = (BaseAutocompleteImplFragment) obj2;
                        baseAutocompleteImplFragment.getClass();
                        editable.toString();
                        baseAutocompleteImplFragment.zzj.getSelectionEnd();
                        throw null;
                    } catch (Error | RuntimeException e) {
                        zznv.zzb(e);
                        throw e;
                    }
                case 3:
                    try {
                        AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) obj2;
                        autocompleteImplFragment.getClass();
                        editable.toString();
                        autocompleteImplFragment.zzh.getSelectionEnd();
                        throw null;
                    } catch (Error | RuntimeException e2) {
                        zznv.zzb(e2);
                        throw e2;
                    }
                case 4:
                    return;
                case 5:
                    editable.getClass();
                    return;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return;
                case 11:
                    editable.getClass();
                    return;
                case 12:
                    BitmapController bitmapController = ((InputNumberComponent) obj2).numberController;
                    if (editable != null && (obj = editable.toString()) != null) {
                        d = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(obj);
                    }
                    bitmapController._bitmapValue.setValue(d);
                    return;
                default:
                    InputSelectListAdapter inputSelectListAdapter = (InputSelectListAdapter) obj2;
                    inputSelectListAdapter.query = String.valueOf(editable);
                    inputSelectListAdapter.updateItems();
                    return;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 5:
                    charSequence.getClass();
                    break;
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String obj;
            String obj2;
            int i4 = this.$r8$classId;
            String str = "";
            boolean z = false;
            Object obj3 = this.this$0;
            switch (i4) {
                case 0:
                    SearchView searchView = (SearchView) obj3;
                    Editable text = searchView.mSearchSrcTextView.getText();
                    searchView.mUserQuery = text;
                    boolean isEmpty = TextUtils.isEmpty(text);
                    searchView.updateSubmitButton(!isEmpty);
                    if (searchView.mVoiceButtonEnabled && !searchView.mIconified && isEmpty) {
                        searchView.mGoButton.setVisibility(8);
                        r7 = 0;
                    }
                    searchView.mVoiceButton.setVisibility(r7);
                    searchView.updateCloseButton();
                    searchView.updateSubmitArea();
                    charSequence.toString();
                    break;
                case 4:
                    ((com.google.android.material.search.SearchView) obj3).clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
                    break;
                case 5:
                    charSequence.getClass();
                    NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = (NfcMrz1LineManualEntryFragment) obj3;
                    String valueOf = String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText());
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = valueOf.toUpperCase(locale);
                    upperCase.getClass();
                    if (!valueOf.equals(upperCase)) {
                        int selectionEnd = nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getSelectionEnd();
                        nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.setText(upperCase);
                        nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.setSelection(selectionEnd);
                        break;
                    }
                    break;
                case 6:
                    SearchFieldBinding searchFieldBinding = (SearchFieldBinding) obj3;
                    MooncakeEditText mooncakeEditText = searchFieldBinding.value.editText;
                    if (!searchFieldBinding.updating) {
                        TextFieldState textFieldState = searchFieldBinding.state;
                        Editable text2 = mooncakeEditText.getText();
                        if (text2 != null && (obj = text2.toString()) != null) {
                            str = obj;
                        }
                        TextFieldState userEdit = textFieldState.userEdit(mooncakeEditText.getSelectionStart(), mooncakeEditText.getSelectionEnd(), str);
                        if (!searchFieldBinding.state.contentEquals(userEdit)) {
                            searchFieldBinding.state = userEdit;
                            GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = searchFieldBinding.onChange;
                            if (graphLoop$processingQueue$1 != null) {
                                graphLoop$processingQueue$1.invoke(userEdit);
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    TextFieldBinding textFieldBinding = (TextFieldBinding) obj3;
                    TextFieldBinding.access$stateChanged(textFieldBinding, textFieldBinding.value);
                    break;
                case 8:
                    MooncakeSearchTextField mooncakeSearchTextField = (MooncakeSearchTextField) obj3;
                    Fade fade = new Fade();
                    fade.mDuration = 150L;
                    AppCompatImageButton appCompatImageButton = mooncakeSearchTextField.clearSearchButton;
                    fade.mTargets.add(appCompatImageButton);
                    TransitionManager.beginDelayedTransition(mooncakeSearchTextField, fade);
                    if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                        r7 = 0;
                    }
                    appCompatImageButton.setVisibility(r7);
                    break;
                case 9:
                    MooncakePillButton mooncakePillButton = (MooncakePillButton) ((PasswordEntryView) obj3).binding.securityViewPasswordActionButton;
                    if (charSequence != null && charSequence.length() > 0) {
                        z = true;
                    }
                    mooncakePillButton.setEnabled(z);
                    break;
                case 10:
                    ProducerScope producerScope = (ProducerScope) obj3;
                    if (charSequence != null && (obj2 = charSequence.toString()) != null) {
                        str = obj2;
                    }
                    Object mo1159trySendJP2dKIU = ((ProducerCoroutine) producerScope)._channel.mo1159trySendJP2dKIU(str);
                    if ((mo1159trySendJP2dKIU instanceof ChannelResult.Closed) || (mo1159trySendJP2dKIU instanceof ChannelResult.Failed)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m$1("textChanges() failed to send element from ", producerScope, ", result: ", ChannelResult.m4193toStringimpl(mo1159trySendJP2dKIU));
                        break;
                    }
                    break;
                case 11:
                    ((Function1) obj3).invoke(charSequence);
                    break;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$3, reason: invalid class name */
    public final class AnonymousClass3 implements View.OnFocusChangeListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            AppCompatEditText appCompatEditText;
            HelperElement helperElement;
            String str;
            String str2;
            FloatingActionButton floatingActionButton;
            ProfileDetailedViewFragment profileDetailedViewFragment;
            FloatingActionButton floatingActionButton2;
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    SearchView searchView = (SearchView) obj;
                    View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(searchView, z);
                        break;
                    }
                    break;
                default:
                    ProfileAdapter profileAdapter = (ProfileAdapter) obj;
                    ProfileStore_ profileStore_ = profileAdapter.profileStore;
                    if ((view instanceof AppCompatEditText) && (view.getTag() instanceof HelperElement)) {
                        appCompatEditText = (AppCompatEditText) view;
                        helperElement = (HelperElement) appCompatEditText.getTag();
                        str = helperElement.element.actingElement().pathKey;
                        str2 = appCompatEditText.getText().toString();
                    } else {
                        appCompatEditText = null;
                        helperElement = null;
                        str = null;
                        str2 = null;
                    }
                    if (!z) {
                        profileAdapter.currentEditingTextView = null;
                        String data = str != null ? profileStore_.getData(str) : "";
                        ProfileDetailedViewFragment profileDetailedViewFragment2 = profileAdapter.mHostingFragment;
                        if (helperElement != null) {
                            Element element = helperElement.element;
                            if (view.getTag() instanceof HelperElement) {
                                if (!element.isNonRecursiveType()) {
                                    profileStore_.setData(str, str2);
                                    profileStore_.store();
                                }
                                if (str2 != null && element.actingElement().mMaskingValue != -99) {
                                    ((EditText) view).setText(HelperFunctions.maskValuesIfNecessary(element.actingElement().mMaskingValue, str2));
                                }
                                ArrayList arrayList = new ArrayList();
                                element.setElementValue(str2);
                                arrayList.add(element);
                                if (("PersonalDetails.FirstName".equals(str) || "PersonalDetails.LastName".equals(str)) && profileDetailedViewFragment2 != null && profileDetailedViewFragment2.getMainActivity() != null) {
                                    profileDetailedViewFragment2.getMainActivity().getClass();
                                }
                            }
                        }
                        boolean z2 = str2 != null && str2.length() > 0;
                        if (str != null) {
                            if ((data == null || data.trim().length() == 0) && z2) {
                                profileAdapter.profileAnalyticsEvent("PROFILE SAVE NEW DATA");
                            } else if (data != null && !data.equals(str2)) {
                                profileAdapter.profileAnalyticsEvent("PROFILE EDIT");
                            }
                        }
                        zzb zzbVar = profileAdapter.textChangeListener;
                        if (zzbVar != null && (floatingActionButton2 = (profileDetailedViewFragment = (ProfileDetailedViewFragment) zzbVar.zza).btnAddArray) != null && profileDetailedViewFragment.isParentArray) {
                            floatingActionButton2.show(null, true);
                            break;
                        }
                    } else {
                        profileAdapter.currentEditingTextView = appCompatEditText;
                        if (view.getTag() instanceof HelperElement) {
                            helperElement = (HelperElement) appCompatEditText.getTag();
                        }
                        Schema_ schema_ = profileAdapter.schema;
                        Element element2 = helperElement.element;
                        if (!ElementType.isInlineEditingField(schema_.getElementType(element2))) {
                            profileAdapter.onClick(view);
                        }
                        if (str2 != null && element2.actingElement().mMaskingValue != -99) {
                            ((EditText) view).setText(profileStore_.getData(element2.actingElement().pathKey));
                        }
                        zzb zzbVar2 = profileAdapter.textChangeListener;
                        if (zzbVar2 != null && (floatingActionButton = ((ProfileDetailedViewFragment) zzbVar2.zza).btnAddArray) != null) {
                            floatingActionButton.hide(null, true);
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$8, reason: invalid class name */
    public final class AnonymousClass8 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass8(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            CharSequence convertSelectionToString;
            switch (this.$r8$classId) {
                case 0:
                    ((SearchView) this.this$0).onItemClicked(i);
                    return;
                case 1:
                    AppCompatSpinner.DropdownPopup dropdownPopup = (AppCompatSpinner.DropdownPopup) this.this$0;
                    AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                    appCompatSpinner.setSelection(i);
                    if (appCompatSpinner.getOnItemClickListener() != null) {
                        appCompatSpinner.performItemClick(view, i, dropdownPopup.mAdapter.getItemId(i));
                    }
                    dropdownPopup.dismiss();
                    return;
                case 2:
                    FillrAddressQueryResult item = ((AddressSelectionDialog) this.this$0).mAdapter.getItem(i);
                    if (((AddressSelectionDialog) this.this$0).mAddressUtil == null || item == null) {
                        return;
                    }
                    String placeId = item.getPlaceId();
                    ((AddressSelectionDialog) this.this$0).mPlaceProgress.setVisibility(0);
                    AddressSelectionDialog addressSelectionDialog = (AddressSelectionDialog) this.this$0;
                    if (addressSelectionDialog.inProgress || placeId == null) {
                        return;
                    }
                    addressSelectionDialog.inProgress = true;
                    Repository repository = addressSelectionDialog.repository;
                    Element element = addressSelectionDialog.element;
                    Repository repository2 = (Repository) repository.consumerAPIClient;
                    String deobfuscateString = new Obfuscator(String.format("%.10f", Double.valueOf(3.141592653589793d)), 0).deobfuscateString(Repository.obfuscatedKEY);
                    ConsumerAPIClientParams consumerAPIClientParams = repository2.getConsumerAPIClientParams(APIEndpoint.GET_PLACE_DETAILS);
                    consumerAPIClientParams.putQueryParam("placeid", placeId);
                    consumerAPIClientParams.putQueryParam("key", deobfuscateString);
                    consumerAPIClientParams.putQueryParam("fields", "place_id,formatted_address,address_components");
                    consumerAPIClientParams.putQueryParam("sessiontoken", Repository.getGooglePlacesSessionId());
                    if (element != null) {
                        if (consumerAPIClientParams.mSpecialParams == null) {
                            consumerAPIClientParams.mSpecialParams = new Bundle();
                        }
                        consumerAPIClientParams.mSpecialParams.putParcelable("profile_element", element);
                    }
                    new ConsumerAPIClientTask((ConsumerAPIClientListener) repository2.consumerAPIClient, "Get Address Details", 0).performAPICall(consumerAPIClientParams);
                    synchronized (Repository.class) {
                        Repository.googlePlacesSessionId = null;
                    }
                    return;
                case 3:
                    InputFragmentDialog inputFragmentDialog = (InputFragmentDialog) this.this$0;
                    InputFragmentDialog.ProfileEditListAdapter profileEditListAdapter = inputFragmentDialog.adapter;
                    if (i == profileEditListAdapter.mCheckedIndex) {
                        profileEditListAdapter.mCheckedIndex = -1;
                    } else {
                        profileEditListAdapter.mCheckedIndex = i;
                    }
                    profileEditListAdapter.notifyDataSetChanged();
                    inputFragmentDialog.doneButton();
                    return;
                default:
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) this.this$0;
                    ListPopupWindow listPopupWindow = materialAutoCompleteTextView.modalListPopup;
                    convertSelectionToString = materialAutoCompleteTextView.convertSelectionToString(i < 0 ? !listPopupWindow.mPopup.isShowing() ? null : listPopupWindow.mDropDownList.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i));
                    materialAutoCompleteTextView.setText(convertSelectionToString, false);
                    AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                    if (onItemClickListener != null) {
                        if (view == null || i < 0) {
                            view = !listPopupWindow.mPopup.isShowing() ? null : listPopupWindow.mDropDownList.getSelectedView();
                            i = !listPopupWindow.mPopup.isShowing() ? -1 : listPopupWindow.mDropDownList.getSelectedItemPosition();
                            j = !listPopupWindow.mPopup.isShowing() ? Long.MIN_VALUE : listPopupWindow.mDropDownList.getSelectedItemId();
                        }
                        onItemClickListener.onItemClick(listPopupWindow.mDropDownList, view, i, j);
                    }
                    listPopupWindow.dismiss();
                    return;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$9, reason: invalid class name */
    public final class AnonymousClass9 implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass9(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onNothingSelected$androidx$appcompat$widget$ListPopupWindow$3(AdapterView adapterView) {
        }

        private final void onNothingSelected$androidx$appcompat$widget$SearchView$9(AdapterView adapterView) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            DropDownListView dropDownListView;
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    SearchView searchView = (SearchView) obj;
                    Editable text = searchView.mSearchSrcTextView.getText();
                    Cursor cursor = searchView.mSuggestionsAdapter.mCursor;
                    if (cursor != null) {
                        if (!cursor.moveToPosition(i)) {
                            searchView.setQuery(text);
                            break;
                        } else {
                            String convertToString = searchView.mSuggestionsAdapter.convertToString(cursor);
                            if (convertToString == null) {
                                searchView.setQuery(text);
                                break;
                            } else {
                                searchView.setQuery(convertToString);
                                break;
                            }
                        }
                    }
                    break;
                default:
                    if (i != -1 && (dropDownListView = ((ListPopupWindow) obj).mDropDownList) != null) {
                        dropDownListView.mListSelectionHidden = false;
                        break;
                    }
                    break;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView adapterView) {
            int i = this.$r8$classId;
        }
    }

    public abstract class Api29Impl {
        public static void refreshAutoCompleteResults(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void setInputMethodMode(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface OnCloseListener {
    }

    public interface OnQueryTextListener {
    }

    public interface OnSuggestionListener {
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(1);
        public boolean isIconified;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isIconified, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.isIconified));
        }
    }

    public final class UpdatableTouchDelegate extends TouchDelegate {
        public final Rect mActualBounds;
        public boolean mDelegateTargeted;
        public final View mDelegateView;
        public final int mSlop;
        public final Rect mSlopBounds;
        public final Rect mTargetBounds;

        public UpdatableTouchDelegate(View view, Rect rect, Rect rect2) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.mSlop = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.mTargetBounds = rect3;
            Rect rect4 = new Rect();
            this.mSlopBounds = rect4;
            Rect rect5 = new Rect();
            this.mActualBounds = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.mDelegateView = view;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.mDelegateTargeted;
                    if (z2 && !this.mSlopBounds.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.mDelegateTargeted;
                        this.mDelegateTargeted = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.mTargetBounds.contains(x, y)) {
                    this.mDelegateTargeted = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.mActualBounds;
            View view = this.mDelegateView;
            if (!z || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.appcompat.widget.SearchView$1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.appcompat.widget.SearchView$1] */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        final int i2 = 0;
        this.mUpdateDrawableStateRunnable = new Runnable(this) { // from class: androidx.appcompat.widget.SearchView.1
            public final /* synthetic */ SearchView this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                SearchView searchView = this.this$0;
                switch (i3) {
                    case 0:
                        searchView.updateFocusedState();
                        break;
                    default:
                        CursorAdapter cursorAdapter = searchView.mSuggestionsAdapter;
                        if (cursorAdapter instanceof SuggestionsAdapter) {
                            cursorAdapter.changeCursor(null);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.mReleaseCursorRunnable = new Runnable(this) { // from class: androidx.appcompat.widget.SearchView.1
            public final /* synthetic */ SearchView this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                SearchView searchView = this.this$0;
                switch (i32) {
                    case 0:
                        searchView.updateFocusedState();
                        break;
                    default:
                        CursorAdapter cursorAdapter = searchView.mSuggestionsAdapter;
                        if (cursorAdapter instanceof SuggestionsAdapter) {
                            cursorAdapter.changeCursor(null);
                            break;
                        }
                        break;
                }
            }
        };
        this.mOutsideDrawablesCache = new WeakHashMap();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView searchView = SearchView.this;
                SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
                if (view == searchView.mSearchButton) {
                    searchView.updateViewsVisibility(false);
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener2 = searchView.mOnSearchClickListener;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(searchView);
                        return;
                    }
                    return;
                }
                if (view == searchView.mCloseButton) {
                    searchView.onCloseClicked();
                    return;
                }
                if (view == searchView.mGoButton) {
                    searchView.onSubmitQuery();
                    return;
                }
                if (view != searchView.mVoiceButton) {
                    if (view == searchAutoComplete) {
                        Api29Impl.refreshAutoCompleteResults(searchAutoComplete);
                        return;
                    }
                    return;
                }
                SearchableInfo searchableInfo = searchView.mSearchable;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.createVoiceAppSearchIntent(searchView.mVoiceAppSearchIntent, searchableInfo));
                        }
                    } else {
                        Intent intent = new Intent(searchView.mVoiceWebSearchIntent);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        };
        View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                SearchView searchView = SearchView.this;
                SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
                if (searchView.mSearchable != null) {
                    if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                        if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i4 == 66) {
                            view.cancelLongPress();
                            searchView.getContext().startActivity(searchView.createIntent(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                            return true;
                        }
                    } else if (searchView.mSearchable != null && searchView.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                        if (i4 == 66 || i4 == 84 || i4 == 61) {
                            searchView.onItemClicked(searchAutoComplete.getListSelection());
                            return true;
                        }
                        if (i4 == 21 || i4 == 22) {
                            searchAutoComplete.setSelection(i4 == 21 ? 0 : searchAutoComplete.length());
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            Api29Impl.setInputMethodMode(searchAutoComplete, 1);
                            if (searchAutoComplete.enoughToFilter()) {
                                searchAutoComplete.showDropDown();
                            }
                            return true;
                        }
                        if (i4 == 19) {
                            searchAutoComplete.getListSelection();
                            return false;
                        }
                    }
                }
                return false;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                SearchView.this.onSubmitQuery();
                return true;
            }
        };
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(this, i2);
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(this, i2);
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(this, i2);
        int[] iArr = R$styleable.SearchView;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArray, i, 0);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        from.inflate(typedArray2.getResourceId(21, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.mSearchView = this;
        this.mSearchEditFrame = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.mSearchPlate = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.mSubmitArea = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        findViewById.setBackground(obtainStyledAttributes.getDrawable(22));
        findViewById2.setBackground(obtainStyledAttributes.getDrawable(27));
        imageView.setImageDrawable(obtainStyledAttributes.getDrawable(25));
        imageView2.setImageDrawable(obtainStyledAttributes.getDrawable(17));
        imageView3.setImageDrawable(obtainStyledAttributes.getDrawable(12));
        imageView4.setImageDrawable(obtainStyledAttributes.getDrawable(30));
        imageView5.setImageDrawable(obtainStyledAttributes.getDrawable(25));
        this.mSearchHintIcon = obtainStyledAttributes.getDrawable(24);
        TooltipCompat$Api26Impl.setTooltipText(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.mSuggestionRowLayout = typedArray2.getResourceId(28, R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = typedArray2.getResourceId(13, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(anonymousClass10);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(anonymousClass8);
        searchAutoComplete.setOnItemSelectedListener(anonymousClass9);
        searchAutoComplete.setOnKeyListener(onKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new AnonymousClass3(this, 0));
        setIconifiedByDefault(typedArray2.getBoolean(20, true));
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = typedArray2.getText(15);
        this.mQueryHint = typedArray2.getText(23);
        int i4 = typedArray2.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = typedArray2.getInt(5, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(typedArray2.getBoolean(1, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new AnonymousClass4(this, 0));
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public final Intent createIntent(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    public final Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string2 = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string3 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string4 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string2);
        intent3.putExtra("android.speech.extra.PROMPT", string3);
        intent3.putExtra("android.speech.extra.LANGUAGE", string4);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    public final void onCloseClicked() {
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            clearFocus();
            updateViewsVisibility(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public final void onItemClicked(int i) {
        int i2;
        String stringOrNull;
        Cursor cursor = this.mSuggestionsAdapter.mCursor;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = SuggestionsAdapter.$r8$clinit;
                String stringOrNull2 = SuggestionsAdapter.getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (stringOrNull2 == null) {
                    stringOrNull2 = this.mSearchable.getSuggestIntentAction();
                }
                if (stringOrNull2 == null) {
                    stringOrNull2 = "android.intent.action.SEARCH";
                }
                String stringOrNull3 = SuggestionsAdapter.getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (stringOrNull3 == null) {
                    stringOrNull3 = this.mSearchable.getSuggestIntentData();
                }
                if (stringOrNull3 != null && (stringOrNull = SuggestionsAdapter.getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    stringOrNull3 = stringOrNull3 + "/" + Uri.encode(stringOrNull);
                }
                intent = createIntent(stringOrNull3 == null ? null : Uri.parse(stringOrNull3), stringOrNull2, SuggestionsAdapter.getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), SuggestionsAdapter.getStringOrNull(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            int[] iArr = this.mTemp;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.mTemp2;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.mSearchSrcTextViewBounds;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.mSearchSrtTextViewBoundsExpanded;
            rect2.set(i7, 0, i8, i9);
            UpdatableTouchDelegate updatableTouchDelegate = this.mTouchDelegate;
            if (updatableTouchDelegate == null) {
                UpdatableTouchDelegate updatableTouchDelegate2 = new UpdatableTouchDelegate(searchAutoComplete, rect2, rect);
                this.mTouchDelegate = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
            } else {
                updatableTouchDelegate.mTargetBounds.set(rect2);
                Rect rect3 = updatableTouchDelegate.mSlopBounds;
                rect3.set(rect2);
                int i10 = -updatableTouchDelegate.mSlop;
                rect3.inset(i10, i10);
                updatableTouchDelegate.mActualBounds.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.mIconified) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        updateViewsVisibility(savedState.isIconified);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isIconified = this.mIconified;
        return savedState;
    }

    public final void onSubmitQuery() {
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.mSearchable != null) {
            getContext().startActivity(createIntent(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.mUpdateDrawableStateRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (this.mIconified) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
            return;
        }
        updateViewsVisibility(false);
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault == z) {
            return;
        }
        this.mIconifiedByDefault = z;
        updateViewsVisibility(z);
        updateQueryHint();
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        CursorAdapter cursorAdapter = this.mSuggestionsAdapter;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).mQueryRefinement = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.mSearchable.getImeOptions());
            int inputType = this.mSearchable.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.mSearchable.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            CursorAdapter cursorAdapter = this.mSuggestionsAdapter;
            if (cursorAdapter != null) {
                cursorAdapter.changeCursor(null);
            }
            if (this.mSearchable.getSuggestAuthority() != null) {
                SuggestionsAdapter suggestionsAdapter = new SuggestionsAdapter(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
                this.mSuggestionsAdapter = suggestionsAdapter;
                searchAutoComplete.setAdapter(suggestionsAdapter);
                ((SuggestionsAdapter) this.mSuggestionsAdapter).mQueryRefinement = this.mQueryRefinement ? 2 : 1;
            }
            updateQueryHint();
        }
        SearchableInfo searchableInfo2 = this.mSearchable;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.mVoiceButtonEnabled = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(this.mIconified);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(this.mIconified);
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.mSuggestionsAdapter = cursorAdapter;
        this.mSearchSrcTextView.setAdapter(cursorAdapter);
    }

    public final void updateCloseButton() {
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = (!isEmpty || (this.mIconifiedByDefault && !this.mExpandedInActionView)) ? 0 : 8;
        ImageView imageView = this.mCloseButton;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void updateQueryHint() {
        Drawable drawable;
        CharSequence charSequence = this.mQueryHint;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.mSearchable;
            charSequence = (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
        }
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.mIconifiedByDefault;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (z && (drawable = this.mSearchHintIcon) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        searchAutoComplete.setHint(charSequence);
    }

    public final void updateSubmitArea() {
        this.mSubmitArea.setVisibility(((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !this.mIconified && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    public final void updateSubmitButton(boolean z) {
        boolean z2 = this.mSubmitButtonEnabled;
        this.mGoButton.setVisibility((!z2 || !(z2 || this.mVoiceButtonEnabled) || this.mIconified || !hasFocus() || (!z && this.mVoiceButtonEnabled)) ? 8 : 0);
    }

    public final void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        updateSubmitButton(!isEmpty);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        ImageView imageView = this.mCollapsedIcon;
        imageView.setVisibility((imageView.getDrawable() == null || this.mIconifiedByDefault) ? 8 : 0);
        updateCloseButton();
        if (this.mVoiceButtonEnabled && !this.mIconified && isEmpty) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
        updateSubmitArea();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$4, reason: invalid class name */
    public final class AnonymousClass4 implements View.OnLayoutChangeListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public AnonymousClass4(TabLayout.TabView tabView, View view) {
            this.$r8$classId = 1;
            this.this$0 = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Anchor anchor;
            int dip;
            int dip2;
            int dip3;
            int i9 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i9) {
                case 0:
                    SearchView searchView = (SearchView) obj;
                    SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
                    View view2 = searchView.mDropDownAnchor;
                    if (view2.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.mSearchPlate.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean z = searchView.getLayoutDirection() == 1;
                        int dimensionPixelSize = searchView.mIconifiedByDefault ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                        searchAutoComplete.getDropDownBackground().getPadding(rect);
                        int i10 = rect.left;
                        searchAutoComplete.setDropDownHorizontalOffset(z ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
                        searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                        return;
                    }
                    return;
                case 1:
                    ((View) obj).getVisibility();
                    return;
                case 2:
                    view.removeOnLayoutChangeListener(this);
                    int i11 = LegacyScaffoldBinding.$r8$clinit;
                    ((LegacyScaffoldBinding) obj).updateFooterElevation();
                    return;
                case 3:
                    view.removeOnLayoutChangeListener(this);
                    int i12 = ScaffoldBinding.$r8$clinit;
                    ((ScaffoldBinding) obj).updateFooterElevation$1();
                    return;
                case 4:
                    view.removeOnLayoutChangeListener(this);
                    ((CardActivationView) obj).loadingHelper.setLoading(true);
                    return;
                case 5:
                    view.removeOnLayoutChangeListener(this);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                    ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = view.getWidth() / 4;
                    layoutParams2.gravity = 17;
                    appCompatImageView.setLayoutParams(layoutParams2);
                    view.setTranslationY(-(appCompatImageView.getWidth() / 4));
                    appCompatImageView.setColorFilter(ThemeHelpersKt.themeInfo(appCompatImageView).colorPalette.label);
                    appCompatImageView.setImageResource(R.drawable.tap_to_pay);
                    appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    appCompatImageView.setAlpha(RecyclerView.DECELERATION_RATE);
                    return;
                case 6:
                    view.removeOnLayoutChangeListener(this);
                    Ui.EventReceiver eventReceiver = ((PaperMoneyDepositBarcodeAndLogoView) obj).eventReceiver;
                    if (eventReceiver != null) {
                        eventReceiver.sendEvent(new PaperMoneyDepositBarcodeEvent.BarcodeParams(view.getHeight(), view.getWidth()));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                case 7:
                    view.removeOnLayoutChangeListener(this);
                    FormView.access$updateButtonHairlineDivider((FormView) obj);
                    return;
                case 8:
                    view.removeOnLayoutChangeListener(this);
                    ((GooglePayActivationView) obj).loadingHelper.setLoading(true);
                    return;
                case 9:
                    view.removeOnLayoutChangeListener(this);
                    ((GooglePayCompleteProvisioningView) obj).loadingHelper.setLoading(true);
                    return;
                case 10:
                    view.removeOnLayoutChangeListener(this);
                    Rect rect2 = new Rect();
                    MooncakeInvestingStockRowView mooncakeInvestingStockRowView = (MooncakeInvestingStockRowView) obj;
                    InvestingMetricView investingMetricView = mooncakeInvestingStockRowView.metricTextView;
                    investingMetricView.getHitRect(rect2);
                    rect2.set(rect2.left - mooncakeInvestingStockRowView.getDip(8), rect2.top - mooncakeInvestingStockRowView.getDip(8), mooncakeInvestingStockRowView.getDip(8) + rect2.right, mooncakeInvestingStockRowView.getDip(8) + rect2.bottom);
                    mooncakeInvestingStockRowView.setTouchDelegate(new TouchDelegate(rect2, investingMetricView));
                    return;
                case 11:
                    view.getClass();
                    PausedCompositionImpl pausedCompositionImpl = (PausedCompositionImpl) obj;
                    MooncakeProgress mooncakeProgress = (MooncakeProgress) pausedCompositionImpl.state;
                    FigmaTextView figmaTextView = (FigmaTextView) pausedCompositionImpl.lock;
                    ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) pausedCompositionImpl.context;
                    Function1 function1 = (Function1) toolbarTuckTargets.endCornerCenterX$delegate;
                    ViewGroup viewGroup = (ViewGroup) pausedCompositionImpl.composition;
                    Rect rect3 = (Rect) function1.invoke(viewGroup);
                    int ordinal = ((LoadingHelper$Position) toolbarTuckTargets.startCornerCenterX$delegate).ordinal();
                    if (ordinal == 0) {
                        anchor = Anchor.TopLeft;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        anchor = Anchor.Center;
                    }
                    CharSequence text = figmaTextView.getText();
                    int dip4 = (text == null || StringsKt.isBlank(text)) ? 0 : Views.dip((View) viewGroup, 16) + mooncakeProgress.getHeight();
                    int ordinal2 = ((LoadingHelper$Position) toolbarTuckTargets.startCornerCenterX$delegate).ordinal();
                    if (ordinal2 == 0) {
                        dip = rect3.left + Views.dip((View) viewGroup, 32);
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        dip = rect3.centerX();
                    }
                    int ordinal3 = ((LoadingHelper$Position) toolbarTuckTargets.startCornerCenterX$delegate).ordinal();
                    if (ordinal3 == 0) {
                        dip2 = rect3.left + Views.dip((View) viewGroup, 80);
                    } else {
                        if (ordinal3 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        dip2 = rect3.centerY() - (dip4 / 2);
                    }
                    int ordinal4 = ((LoadingHelper$Position) toolbarTuckTargets.startCornerCenterX$delegate).ordinal();
                    if (ordinal4 == 0) {
                        dip3 = dip4 + Views.dip((View) viewGroup, 80) + rect3.left;
                    } else {
                        if (ordinal4 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        dip3 = (dip4 / 2) + rect3.centerY();
                    }
                    LayoutHelpersKt.layoutBy(mooncakeProgress, anchor, dip, dip2);
                    LayoutHelpersKt.layoutBy(figmaTextView, anchor, dip, dip3);
                    ((View) pausedCompositionImpl.invalidScopes).layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                    return;
                default:
                    view.removeOnLayoutChangeListener(this);
                    ChatView chatView = (ChatView) obj;
                    TranscriptRecyclerView transcriptRecyclerView = chatView.chatView;
                    RecyclerView.Adapter adapter = transcriptRecyclerView.mAdapter;
                    ChatView.access$emitLastMessageVisibilityChange(chatView, transcriptRecyclerView.linearLayoutManager.findLastVisibleItemPosition() >= (adapter != null ? adapter.getItemCount() : 0) + (-2));
                    return;
            }
        }

        public /* synthetic */ AnonymousClass4(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public boolean mHasPendingShowSoftInputRequest;
        public final AnonymousClass1 mRunShowSoftInputIfNecessary;
        public SearchView mSearchView;
        public int mThreshold;

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.appcompat.widget.SearchView$SearchAutoComplete$1] */
        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mRunShowSoftInputIfNecessary = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.mHasPendingShowSoftInputRequest) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.mHasPendingShowSoftInputRequest = false;
                    }
                }
            };
            this.mThreshold = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.mThreshold <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.mHasPendingShowSoftInputRequest) {
                AnonymousClass1 anonymousClass1 = this.mRunShowSoftInputIfNecessary;
                removeCallbacks(anonymousClass1);
                post(anonymousClass1);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE : 256, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.mSearchView;
            searchView.updateViewsVisibility(searchView.mIconified);
            searchView.post(searchView.mUpdateDrawableStateRunnable);
            SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
            if (searchAutoComplete.hasFocus()) {
                Api29Impl.refreshAutoCompleteResults(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.mSearchView.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.mSearchView.hasFocus() && getVisibility() == 0) {
                this.mHasPendingShowSoftInputRequest = true;
                Context context = getContext();
                int i = SearchView.$r8$clinit;
                if (context.getResources().getConfiguration().orientation == 2) {
                    Api29Impl.setInputMethodMode(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public final void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            AnonymousClass1 anonymousClass1 = this.mRunShowSoftInputIfNecessary;
            if (!z) {
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(anonymousClass1);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.mHasPendingShowSoftInputRequest = true;
                    return;
                }
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(anonymousClass1);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.mThreshold = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public final void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
