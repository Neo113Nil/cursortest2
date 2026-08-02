package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.BackgroundEffect;
import com.squareup.cash.payments.screens.SkippableStep;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.TitleTapped;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class Size implements Parcelable {
    public static final Parcelable.Creator<Size> CREATOR = new Creator(0);
    public static final Size Zero = new Size(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    public final float height;
    public final float width;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            Image image;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            ListProperty listProperty;
            boolean z7;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Size(parcel.readFloat(), parcel.readFloat());
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return SkippableStep.SkipRequirement.RecipientIsCrypto.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return SkippableStep.SkipRequirement.StablecoinSelectionNotRequired.INSTANCE;
                case 3:
                    parcel.getClass();
                    String readString = parcel.readString();
                    Image image2 = (Image) parcel.readParcelable(Background.class.getClassLoader());
                    Image image3 = (Image) parcel.readParcelable(Background.class.getClassLoader());
                    Color color = (Color) parcel.readParcelable(Background.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z = true;
                        cls = Background.class;
                        image = image3;
                    } else {
                        cls = Background.class;
                        image = image3;
                        z = false;
                    }
                    TextFormat textFormat = (TextFormat) parcel.readParcelable(cls.getClassLoader());
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(BackgroundEffect.valueOf(parcel.readString()));
                    }
                    return new Background(readString, image2, image, color, z, textFormat, arrayList, parcel.readString());
                case 4:
                    parcel.getClass();
                    return ConfirmRecipientDialogResult.valueOf(parcel.readString());
                case 5:
                    parcel.getClass();
                    return new LabeledDetailRow(parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new ListProperty(Position.CREATOR.createFromParcel(parcel), Rotation.CREATOR.createFromParcel(parcel), Zoom.CREATOR.createFromParcel(parcel), Size.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                case 7:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentConfigurationTitleViewModel.TitleViewModel.CREATOR, parcel, arrayList2, i2, 1);
                    }
                    return new PaymentConfigurationTitleViewModel(arrayList2, parcel.readInt() != 0);
                case 8:
                    parcel.getClass();
                    return new PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel((Color) parcel.readParcelable(PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel.class.getClassLoader()), (Image) parcel.readParcelable(PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel.class.getClassLoader()), parcel.readString());
                case 9:
                    parcel.getClass();
                    return new PaymentConfigurationTitleViewModel.TitleViewModel(parcel.readInt() != 0 ? PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TitleTapped) parcel.readParcelable(PaymentConfigurationTitleViewModel.TitleViewModel.class.getClassLoader()), parcel.readInt() != 0);
                case 10:
                    boolean z8 = true;
                    parcel.getClass();
                    PaymentConfigurationTitleViewModel createFromParcel = PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                        z8 = false;
                    }
                    return new PaymentConfigurationViewModel.InputAmount(createFromParcel, z8, (RecipientViewModel) parcel.readParcelable(PaymentConfigurationViewModel.InputAmount.class.getClassLoader()), parcel.readString(), CurrencyCode.valueOf(parcel.readString()), parcel.readInt() != 0 ? z2 : false, parcel.readString());
                case 11:
                    boolean z9 = false;
                    parcel.getClass();
                    PaymentConfigurationTitleViewModel createFromParcel2 = PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z3 = false;
                        z9 = true;
                    } else {
                        z3 = false;
                    }
                    return new PaymentConfigurationViewModel.InputNote(createFromParcel2, z9, (RecipientViewModel) parcel.readParcelable(PaymentConfigurationViewModel.InputNote.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? true : z3, parcel.readString());
                case 12:
                    parcel.getClass();
                    return new PaymentConfigurationViewModel.Loading(PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PaymentConfigurationViewModel.Loading.LoadingStatus) parcel.readParcelable(PaymentConfigurationViewModel.Loading.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentConfigurationViewModel.Loading.LoadingStatus.Errored.INSTANCE;
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentConfigurationViewModel.Loading.LoadingStatus.OpenedOwnLink.INSTANCE;
                case 15:
                    parcel.getClass();
                    PaymentConfigurationTitleViewModel createFromParcel3 = PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z5 = true;
                        z4 = true;
                    } else {
                        z4 = true;
                        z5 = false;
                    }
                    return new PaymentConfigurationViewModel.RequestShareOption(createFromParcel3, z5, parcel.readString(), parcel.readInt() != 0 ? z4 : false, parcel.readInt() != 0 ? z4 : false, parcel.readInt() != 0 ? z4 : false);
                case 16:
                    parcel.getClass();
                    PaymentConfigurationTitleViewModel createFromParcel4 = PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel);
                    RecipientViewModel recipientViewModel = (RecipientViewModel) parcel.readParcelable(PaymentConfigurationViewModel.ReviewPayment.class.getClassLoader());
                    boolean z10 = parcel.readInt() != 0;
                    boolean z11 = parcel.readInt() != 0;
                    boolean z12 = parcel.readInt() != 0;
                    boolean z13 = parcel.readInt() != 0;
                    boolean z14 = parcel.readInt() != 0;
                    RecurringDisabledInstrument valueOf = parcel.readInt() != 0 ? RecurringDisabledInstrument.valueOf(parcel.readString()) : null;
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(LabeledDetailRow.CREATOR, parcel, arrayList3, i3, 1);
                    }
                    EmptyList emptyList = EmptyList.INSTANCE;
                    return new PaymentConfigurationViewModel.ReviewPayment(createFromParcel4, recipientViewModel, z10, z11, z12, z13, z14, valueOf, null, null, emptyList, null, null, emptyList, null, readString2, readString3, readString4, arrayList3);
                case 17:
                    parcel.getClass();
                    return new PaymentConfigurationViewModel.SelectRecipientMenu(PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, EmptyList.INSTANCE, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                case 18:
                    int i4 = 0;
                    parcel.getClass();
                    PaymentConfigurationTitleViewModel createFromParcel5 = PaymentConfigurationTitleViewModel.CREATOR.createFromParcel(parcel);
                    boolean z15 = parcel.readInt() != 0;
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    while (i4 != readInt4) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(StablecoinWithdrawalOptionRow.CREATOR, parcel, arrayList4, i4, 1);
                    }
                    return new PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption(createFromParcel5, z15, arrayList4, parcel.readString());
                case 19:
                    parcel.getClass();
                    return new Position(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                case 20:
                    parcel.getClass();
                    return new Rotation(parcel.readFloat());
                case 21:
                    parcel.getClass();
                    return new SelectedRecipient((Redacted) parcel.readParcelable(SelectedRecipient.class.getClassLoader()), (Redacted) parcel.readParcelable(SelectedRecipient.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new SelectedTrack((Image) parcel.readParcelable(SelectedTrack.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new StablecoinWithdrawalOptionRow((StablecoinWithdrawalOption) parcel.readParcelable(StablecoinWithdrawalOptionRow.class.getClassLoader()), PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    return new Sticker(parcel.readInt(), ListProperty.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 25:
                    parcel.getClass();
                    int readInt5 = parcel.readInt();
                    ListProperty createFromParcel6 = ListProperty.CREATOR.createFromParcel(parcel);
                    float readFloat = parcel.readFloat();
                    if (parcel.readInt() != 0) {
                        z6 = true;
                        listProperty = createFromParcel6;
                        z7 = true;
                    } else {
                        z6 = true;
                        listProperty = createFromParcel6;
                        z7 = false;
                    }
                    return new Text(readInt5, listProperty, readFloat, z7, parcel.readInt() != 0 ? z6 : false, parcel.readString());
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return TitleTapped.AmountTapped.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return TitleTapped.NoteTapped.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new TitleTapped.RecipientTapped((RecipientViewModel) parcel.readParcelable(TitleTapped.RecipientTapped.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new Zoom(parcel.readFloat());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Size[i];
                case 1:
                    return new SkippableStep.SkipRequirement.RecipientIsCrypto[i];
                case 2:
                    return new SkippableStep.SkipRequirement.StablecoinSelectionNotRequired[i];
                case 3:
                    return new Background[i];
                case 4:
                    return new ConfirmRecipientDialogResult[i];
                case 5:
                    return new LabeledDetailRow[i];
                case 6:
                    return new ListProperty[i];
                case 7:
                    return new PaymentConfigurationTitleViewModel[i];
                case 8:
                    return new PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel[i];
                case 9:
                    return new PaymentConfigurationTitleViewModel.TitleViewModel[i];
                case 10:
                    return new PaymentConfigurationViewModel.InputAmount[i];
                case 11:
                    return new PaymentConfigurationViewModel.InputNote[i];
                case 12:
                    return new PaymentConfigurationViewModel.Loading[i];
                case 13:
                    return new PaymentConfigurationViewModel.Loading.LoadingStatus.Errored[i];
                case 14:
                    return new PaymentConfigurationViewModel.Loading.LoadingStatus.OpenedOwnLink[i];
                case 15:
                    return new PaymentConfigurationViewModel.RequestShareOption[i];
                case 16:
                    return new PaymentConfigurationViewModel.ReviewPayment[i];
                case 17:
                    return new PaymentConfigurationViewModel.SelectRecipientMenu[i];
                case 18:
                    return new PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption[i];
                case 19:
                    return new Position[i];
                case 20:
                    return new Rotation[i];
                case 21:
                    return new SelectedRecipient[i];
                case 22:
                    return new SelectedTrack[i];
                case 23:
                    return new StablecoinWithdrawalOptionRow[i];
                case 24:
                    return new Sticker[i];
                case 25:
                    return new Text[i];
                case 26:
                    return new TitleTapped.AmountTapped[i];
                case 27:
                    return new TitleTapped.NoteTapped[i];
                case 28:
                    return new TitleTapped.RecipientTapped[i];
                default:
                    return new Zoom[i];
            }
        }
    }

    public Size(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return Float.compare(this.width, size.width) == 0 && Float.compare(this.height, size.height) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.height) + (Float.hashCode(this.width) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }
}
