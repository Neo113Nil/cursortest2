package com.squareup.cash.music.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.screens.ChatSourceContext;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotDebugOverlayScreen;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackAnswer;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackQuestion;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerAnswer;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotTextInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.moneybot.screens.RawMessagesScreen;
import com.squareup.cash.moneybot.screens.ThumbDirection;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.multiplatform.bitcoin.parsers.ethereum.EthereumAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MusicScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<MusicScreen> CREATOR = new Creator(0);
    public final String currentTrackId;
    public final AskedQuestion question;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new MusicScreen(parcel.readString(), (AskedQuestion) parcel.readParcelable(MusicScreen.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new MoneybotAmountInputQuestion((Money) parcel.readParcelable(MoneybotAmountInputQuestion.class.getClassLoader()), (Money) parcel.readParcelable(MoneybotAmountInputQuestion.class.getClassLoader()), (Money) parcel.readParcelable(MoneybotAmountInputQuestion.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    return new MoneybotAmountInputScreen((AskedQuestion) parcel.readParcelable(MoneybotAmountInputScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new MoneybotChatScreen((ChatKickoffParams) parcel.readParcelable(MoneybotChatScreen.class.getClassLoader()), parcel.readInt() == 0 ? null : MoneybotChatEntryPoint.valueOf(parcel.readString()), parcel.readInt() != 0 ? HomeSourceContext.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, (MoneybotPendingSheet$TransferOptionPicker) parcel.readParcelable(MoneybotChatScreen.class.getClassLoader()));
                case 4:
                    parcel.getClass();
                    return new MoneybotDebugOverlayScreen(parcel.readInt() != 0 ? ChatSourceContext.CREATOR.createFromParcel(parcel) : null);
                case 5:
                    parcel.getClass();
                    return new MoneybotFeedbackAnswer.Dismissed(parcel.readString(), parcel.readString(), ThumbDirection.valueOf(parcel.readString()));
                case 6:
                    parcel.getClass();
                    return new MoneybotFeedbackAnswer.Submitted(parcel.readString(), parcel.readString(), ThumbDirection.valueOf(parcel.readString()), (MoneybotFeedbackOption) parcel.readParcelable(MoneybotFeedbackAnswer.Submitted.class.getClassLoader()), parcel.readString());
                case 7:
                    parcel.getClass();
                    return MoneybotFeedbackOption.Negative.valueOf(parcel.readString());
                case 8:
                    parcel.getClass();
                    return MoneybotFeedbackOption.Positive.valueOf(parcel.readString());
                case 9:
                    parcel.getClass();
                    return new MoneybotFeedbackQuestion(parcel.readString(), parcel.readString(), ThumbDirection.valueOf(parcel.readString()), parcel.readInt() != 0 ? ThumbDirection.valueOf(parcel.readString()) : null);
                case 10:
                    parcel.getClass();
                    return new MoneybotFeedbackScreen((AskedQuestion) parcel.readParcelable(MoneybotFeedbackScreen.class.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new MoneybotOverflowMenuScreen(parcel.readInt() == 0 ? null : ChatSourceContext.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HomeSourceContext.CREATOR.createFromParcel(parcel) : null);
                case 12:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Money money = (Money) parcel.readParcelable(MoneybotPendingSheet$TransferOptionPicker.class.getClassLoader());
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(TransferOptions.valueOf(parcel.readString()));
                    }
                    return new MoneybotPendingSheet$TransferOptionPicker(readString, readString2, money, arrayList, parcel.readString(), parcel.readString(), (TransferOptionPickerSelection) parcel.readParcelable(MoneybotPendingSheet$TransferOptionPicker.class.getClassLoader()), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return MoneybotStaticPickerAnswer.Dismissed.INSTANCE;
                case 14:
                    parcel.getClass();
                    return new MoneybotStaticPickerAnswer.Selected(MoneybotStaticPickerOption.CREATOR.createFromParcel(parcel));
                case 15:
                    parcel.getClass();
                    return new MoneybotStaticPickerOption(parcel.readString(), parcel.readString(), parcel.readString(), (Money) parcel.readParcelable(MoneybotStaticPickerOption.class.getClassLoader()), (MoneybotStaticPickerOption.Icon) parcel.readParcelable(MoneybotStaticPickerOption.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new MoneybotStaticPickerOption.Icon.Avatar((UiAvatar) parcel.readParcelable(MoneybotStaticPickerOption.Icon.Avatar.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new MoneybotStaticPickerOption.Icon.SavingsGoalIcon((SavingsGoalIcon) parcel.readParcelable(MoneybotStaticPickerOption.Icon.SavingsGoalIcon.class.getClassLoader()));
                case 18:
                    int i2 = 0;
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(MoneybotStaticPickerOption.CREATOR, parcel, arrayList2, i2, 1);
                    }
                    return new MoneybotStaticPickerQuestion(readString3, readString4, arrayList2, parcel.readString(), (Money) parcel.readParcelable(MoneybotStaticPickerQuestion.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new MoneybotStaticPickerScreen((AskedQuestion) parcel.readParcelable(MoneybotStaticPickerScreen.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return MoneybotTextInputAnswer.Dismissed.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new MoneybotTextInputAnswer.Selected(parcel.readString());
                case 22:
                    parcel.getClass();
                    return new MoneybotTextInputQuestion(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new MoneybotTextInputScreen((AskedQuestion) parcel.readParcelable(MoneybotTextInputScreen.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new RawMessagesScreen(parcel.readString());
                case 25:
                    parcel.getClass();
                    return AlertDialogResult.valueOf(parcel.readString());
                case 26:
                    parcel.getClass();
                    return new EthereumAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 27:
                    parcel.getClass();
                    return new SolanaAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return MusicQuestion.INSTANCE;
                default:
                    parcel.getClass();
                    return new SelectedTrackResult((Image) parcel.readParcelable(SelectedTrackResult.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new MusicScreen[i];
                case 1:
                    return new MoneybotAmountInputQuestion[i];
                case 2:
                    return new MoneybotAmountInputScreen[i];
                case 3:
                    return new MoneybotChatScreen[i];
                case 4:
                    return new MoneybotDebugOverlayScreen[i];
                case 5:
                    return new MoneybotFeedbackAnswer.Dismissed[i];
                case 6:
                    return new MoneybotFeedbackAnswer.Submitted[i];
                case 7:
                    return new MoneybotFeedbackOption.Negative[i];
                case 8:
                    return new MoneybotFeedbackOption.Positive[i];
                case 9:
                    return new MoneybotFeedbackQuestion[i];
                case 10:
                    return new MoneybotFeedbackScreen[i];
                case 11:
                    return new MoneybotOverflowMenuScreen[i];
                case 12:
                    return new MoneybotPendingSheet$TransferOptionPicker[i];
                case 13:
                    return new MoneybotStaticPickerAnswer.Dismissed[i];
                case 14:
                    return new MoneybotStaticPickerAnswer.Selected[i];
                case 15:
                    return new MoneybotStaticPickerOption[i];
                case 16:
                    return new MoneybotStaticPickerOption.Icon.Avatar[i];
                case 17:
                    return new MoneybotStaticPickerOption.Icon.SavingsGoalIcon[i];
                case 18:
                    return new MoneybotStaticPickerQuestion[i];
                case 19:
                    return new MoneybotStaticPickerScreen[i];
                case 20:
                    return new MoneybotTextInputAnswer.Dismissed[i];
                case 21:
                    return new MoneybotTextInputAnswer.Selected[i];
                case 22:
                    return new MoneybotTextInputQuestion[i];
                case 23:
                    return new MoneybotTextInputScreen[i];
                case 24:
                    return new RawMessagesScreen[i];
                case 25:
                    return new AlertDialogResult[i];
                case 26:
                    return new EthereumAddress[i];
                case 27:
                    return new SolanaAddress[i];
                case 28:
                    return new MusicQuestion[i];
                default:
                    return new SelectedTrackResult[i];
            }
        }
    }

    public final class MusicQuestion implements Question {
        public static final MusicQuestion INSTANCE = new MusicQuestion();
        public static final Parcelable.Creator<MusicQuestion> CREATOR = new Creator(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MusicQuestion);
        }

        public final int hashCode() {
            return -438511924;
        }

        public final String toString() {
            return "MusicQuestion";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class SelectedTrackResult implements Parcelable {
        public static final Parcelable.Creator<SelectedTrackResult> CREATOR = new Creator(29);
        public final String artist;
        public final Image image;
        public final String musicId;
        public final String title;

        public SelectedTrackResult(Image image, String str, String str2, String str3) {
            image.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.image = image;
            this.title = str;
            this.artist = str2;
            this.musicId = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedTrackResult)) {
                return false;
            }
            SelectedTrackResult selectedTrackResult = (SelectedTrackResult) obj;
            return Intrinsics.areEqual(this.image, selectedTrackResult.image) && Intrinsics.areEqual(this.title, selectedTrackResult.title) && Intrinsics.areEqual(this.artist, selectedTrackResult.artist) && Intrinsics.areEqual(this.musicId, selectedTrackResult.musicId);
        }

        public final int hashCode() {
            return this.musicId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title), 31, this.artist);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "SelectedTrackResult(image=", ", title=", this.title, ", artist="), this.artist, ", musicId=", this.musicId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.image, i);
            parcel.writeString(this.title);
            parcel.writeString(this.artist);
            parcel.writeString(this.musicId);
        }
    }

    public MusicScreen(String str, AskedQuestion askedQuestion) {
        this.currentTrackId = str;
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicScreen)) {
            return false;
        }
        MusicScreen musicScreen = (MusicScreen) obj;
        return Intrinsics.areEqual(this.currentTrackId, musicScreen.currentTrackId) && Intrinsics.areEqual(this.question, musicScreen.question);
    }

    public final int hashCode() {
        String str = this.currentTrackId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AskedQuestion askedQuestion = this.question;
        return hashCode + (askedQuestion != null ? askedQuestion.hashCode() : 0);
    }

    public final String toString() {
        return "MusicScreen(currentTrackId=" + this.currentTrackId + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.currentTrackId);
        parcel.writeParcelable(this.question, i);
    }
}
