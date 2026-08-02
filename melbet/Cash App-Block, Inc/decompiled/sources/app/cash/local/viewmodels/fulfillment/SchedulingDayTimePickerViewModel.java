package app.cash.local.viewmodels.fulfillment;

import app.cash.local.viewmodels.internal.CanWorkAsync;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SchedulingDayTimePickerViewModel implements CanWorkAsync {
    public final ModelState modelState;
    public final String title;

    public interface ModelState {

        public final class FailedToLoadDays implements ModelState {
            public static final FailedToLoadDays INSTANCE = new FailedToLoadDays();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FailedToLoadDays);
            }

            public final int hashCode() {
                return 862020812;
            }

            public final String toString() {
                return "FailedToLoadDays";
            }
        }

        public final class LoadedDays implements ModelState {
            public final List schedulingDays;
            public final SchedulingDay selectedDay;
            public final TimesState timesState;

            public interface TimesState {

                public final class FailedToLoadTimes implements TimesState {
                    public static final FailedToLoadTimes INSTANCE = new FailedToLoadTimes();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof FailedToLoadTimes);
                    }

                    public final int hashCode() {
                        return 1942969632;
                    }

                    public final String toString() {
                        return "FailedToLoadTimes";
                    }
                }

                public final class LoadedTimes implements TimesState {
                    public final SchedulingTime selectedTime;

                    public LoadedTimes(SchedulingTime schedulingTime) {
                        this.selectedTime = schedulingTime;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof LoadedTimes) && this.selectedTime.equals(((LoadedTimes) obj).selectedTime);
                    }

                    public final int hashCode() {
                        return this.selectedTime.hashCode();
                    }

                    public final String toString() {
                        return "LoadedTimes(selectedTime=" + this.selectedTime + ")";
                    }
                }

                public final class LoadingTimes implements TimesState {
                    public static final LoadingTimes INSTANCE = new LoadingTimes();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof LoadingTimes);
                    }

                    public final int hashCode() {
                        return 1897189522;
                    }

                    public final String toString() {
                        return "LoadingTimes";
                    }
                }
            }

            public LoadedDays(List list, SchedulingDay schedulingDay, TimesState timesState) {
                schedulingDay.getClass();
                this.schedulingDays = list;
                this.selectedDay = schedulingDay;
                this.timesState = timesState;
            }

            public static LoadedDays copy$default(LoadedDays loadedDays, SchedulingDay schedulingDay, TimesState timesState, int i) {
                List list = loadedDays.schedulingDays;
                if ((i & 2) != 0) {
                    schedulingDay = loadedDays.selectedDay;
                }
                loadedDays.getClass();
                schedulingDay.getClass();
                return new LoadedDays(list, schedulingDay, timesState);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadedDays)) {
                    return false;
                }
                LoadedDays loadedDays = (LoadedDays) obj;
                return this.schedulingDays.equals(loadedDays.schedulingDays) && Intrinsics.areEqual(this.selectedDay, loadedDays.selectedDay) && this.timesState.equals(loadedDays.timesState);
            }

            @Override // app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel.ModelState
            public final TimesState getTimesState() {
                return this.timesState;
            }

            public final int hashCode() {
                return this.timesState.hashCode() + ((this.selectedDay.hashCode() + (this.schedulingDays.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "LoadedDays(schedulingDays=" + this.schedulingDays + ", selectedDay=" + this.selectedDay + ", timesState=" + this.timesState + ")";
            }
        }

        public final class LoadingDays implements ModelState {
            public static final LoadingDays INSTANCE = new LoadingDays();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingDays);
            }

            public final int hashCode() {
                return 245654172;
            }

            public final String toString() {
                return "LoadingDays";
            }
        }

        default LoadedDays.TimesState getTimesState() {
            return null;
        }
    }

    public SchedulingDayTimePickerViewModel(String str, ModelState modelState) {
        modelState.getClass();
        this.title = str;
        this.modelState = modelState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchedulingDayTimePickerViewModel)) {
            return false;
        }
        SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel = (SchedulingDayTimePickerViewModel) obj;
        return this.title.equals(schedulingDayTimePickerViewModel.title) && Intrinsics.areEqual(this.modelState, schedulingDayTimePickerViewModel.modelState);
    }

    public final int hashCode() {
        return this.modelState.hashCode() + (this.title.hashCode() * 31);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        ModelState modelState = this.modelState;
        return (modelState instanceof ModelState.LoadingDays) || (modelState.getTimesState() instanceof ModelState.LoadedDays.TimesState.LoadingTimes);
    }

    public final String toString() {
        return "SchedulingDayTimePickerViewModel(title=" + this.title + ", modelState=" + this.modelState + ")";
    }
}
